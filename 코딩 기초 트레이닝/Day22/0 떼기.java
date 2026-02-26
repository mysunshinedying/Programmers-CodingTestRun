// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181847

class Solution {
    public String solution(String n_str) {
        String answer = "";

        for(int i = 0; i < n_str.length(); i++){
            char zero = n_str.charAt(i);
            if(zero != '0'){
                answer = n_str.substring(i);
                break;
            }
        }

        return answer;
    }
}