// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181906

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;

        if(my_string.startsWith(is_prefix))
            answer = 1;

        return answer;
    }
}