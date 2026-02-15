// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181903

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        for(int i = 0; i < code.length(); i++){
            if(i % q == r)
                answer += code.charAt(i);
        }

        return answer;
    }
}