// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181873

class Solution {
    public String solution(String my_string, String alp) {
        String upperAlp = alp.toUpperCase();

        my_string = my_string.replace(alp, upperAlp);

        return my_string;
    }
}