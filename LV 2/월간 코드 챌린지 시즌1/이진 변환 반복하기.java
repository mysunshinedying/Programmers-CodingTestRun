// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[2];
        StringBuilder sb = new StringBuilder();
        sb.append(s); //sb로 수정한다

        while(sb.length() > 1 || sb.charAt(0) != '1'){
            int len = sb.length();
            for(int i = len - 1; i >= 0; i--){
                if(sb.charAt(i) == '0') {
                    sb.deleteCharAt(i);
                    answer[1]++;
                }
            }
            String binary = Integer.toBinaryString(sb.length());

            sb.setLength(0);
            sb.append(binary);

            answer[0]++;
        }


        return answer;
    }
}