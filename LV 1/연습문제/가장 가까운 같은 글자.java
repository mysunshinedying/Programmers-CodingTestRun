// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/142086

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        for(int i = s.length() - 1; i >= 0; i--){
            int idx = 0;
            sb.setLength(i);
            char c = s.charAt(i);

            idx = sb.lastIndexOf(String.valueOf(c));
            if(idx != -1) { answer[i] = i - idx; }
            else { answer[i] = -1; }
        }


        return answer;
    }
}