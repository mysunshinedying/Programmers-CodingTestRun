// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181938

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int plusType = Integer.parseInt("" + a + b);
        int multiplyType = 2 * a * b;
        if(multiplyType > plusType)
            answer = multiplyType;
        else
            answer = plusType;
        return answer;
    }
}