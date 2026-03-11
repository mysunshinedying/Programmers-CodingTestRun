// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12951

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();
        boolean isFirst = true;

        char[] c = s.toCharArray();

        for(int j = 0; j < c.length; j++){
            if(isFirst && c[j] != ' ') {
                c[j] = Character.toUpperCase(c[j]);
                isFirst = false;
            }
            if(c[j] == ' ') {
                isFirst = true;
            }
            sb.append(c[j]);
        }

        return sb.toString();
    }
}