// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181942
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        if(str1.length() != str2.length()){
            return answer;
        }
        for(int i = 0; i<str1.length(); i++){
            char str1Char = str1.charAt(i);
            char str2Char = str2.charAt(i);
            answer += str1Char;
            answer += str2Char;

        }
        return answer;
    }
}