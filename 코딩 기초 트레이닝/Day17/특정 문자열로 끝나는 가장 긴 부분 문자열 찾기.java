// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181872

class Solution {
    public String solution(String myString, String pat) {

        for(int i = myString.length() - pat.length(); i > 0; i--) {

            int lastIdx = myString.lastIndexOf(pat);
            if (lastIdx == -1) return "";
            return myString.substring(0, lastIdx + pat.length());

        }
        return "";
    }
}