// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181910

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int strLength = my_string.length();

        answer = my_string.substring(strLength - n);

        return answer;
    }
}