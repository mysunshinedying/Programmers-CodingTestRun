// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/468370

import java.util.StringTokenizer;
import java.util.HashSet;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        //단어 갯수 세기
        int count = new StringTokenizer(message).countTokens();
        int index = message.indexOf(" ");

        int[] blank = new int[(count - 1)];
        int idx = 0;

        while(index != -1 && idx < blank.length) {
            blank[idx++] = index;
            index = message.indexOf(" ", index + 1);
        }

        // 각 단어의 range를 알아볼까 그럼?
        // 첫번째 단어는 0 -> blank[0] - 1 (공백 제외)
        // 두번째 단어는 blank[0] + 1 -> blank[1] - 1
        // … 마지막 단어는 blank[n] -> message.length() -1

        int[][] words = new int[count][2];

        if (count == 1) {
            words[0][0] = 0;
            words[0][1] = message.length() - 1;
        } else if (count > 1) {
            words[0][0] = 0;
            words[0][1] = blank[0] - 1;
            words[count - 1][0] = blank[count - 2] + 1;
            words[count - 1][1] = message.length() - 1;

            for(int i = 1; i < blank.length; i++) {
                words[i][0] = blank[i - 1] + 1;
                words[i][1] = blank[i] - 1;
            }
        }

        //range 추가 종료

        String[] wordStrings = new String[count];
        HashSet<String> nonSpoilerWords = new HashSet<>();

        for (int i = 0; i < count; i++) {
            wordStrings[i] = message.substring(words[i][0], words[i][1] + 1);

            boolean hasOverlap = false;
            for (int[] range : spoiler_ranges) {
                int s_start = range[0];
                int s_end = range[1];
                int w_start = words[i][0];
                int w_end = words[i][1];

                if (!(w_end < s_start || w_start > s_end)) {
                    hasOverlap = true;
                    break;
                }
            }
            if (!hasOverlap) {
                nonSpoilerWords.add(wordStrings[i]);
            }
        }

        //중요 단어 카운트
        HashSet<String> revealedWords = new HashSet<>();

        for (int[] range : spoiler_ranges) {
            int s_start = range[0];
            int s_end = range[1];

            for (int i = 0; i < count; i++) {
                int w_start = words[i][0];
                int w_end = words[i][1];

                if (!(w_end < s_start || w_start > s_end)) {
                    String word = wordStrings[i];

                    if (!revealedWords.contains(word)) {
                        if (!nonSpoilerWords.contains(word)) {
                            answer++;
                        }
                        revealedWords.add(word);
                    }
                }
            }
        }

        return answer;
    }
}