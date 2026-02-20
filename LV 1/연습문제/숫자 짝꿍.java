// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/131128

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] countX = new int[10];
        int[] countY = new int[10];
        int pair = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        for(char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        for(int i = 9; i >= 0; i--){
            pair = (int)Math.min(countX[i], countY[i]);

            for(int j = 1; j <= pair; j++){
                sb.append(i);
            }

        }

        if (sb.length() == 0) {
            return "-1";
        }

        answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }
}