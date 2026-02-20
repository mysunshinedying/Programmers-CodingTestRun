// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/131130

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        int count = 0;
        int i = 0;

        ArrayList<Integer> list = new ArrayList<>();

        boolean[] opened = new boolean[cards.length];

        while(true) {
            if(i >= cards.length)
                break;
            if(cards[i] == i + 1) {
                opened[i] = true;
                i++;
                count = 1;
                list.add(count);
                count = 0;
                continue;
            }

            if(opened[i]) {
                if(count > 0) {
                    list.add(count);
                    count = 0;
                }
                i++;
                continue;
            }

            opened[i] = true;
            i = cards[i] - 1;
            count++;
        }

        if (count > 0) list.add(count);

        if(list.size() < 2) return 0;
        list.sort(Comparator.reverseOrder());

        answer = list.get(0) * list.get(1);

        return answer;
    }
}