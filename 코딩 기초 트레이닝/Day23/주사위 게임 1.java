// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181839

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if((a + b) % 2 == 1) {
            answer = 2 * (a + b);
        } else {
            if(a % 2 == 0) {
                answer = Math.max(a, b) - Math.min(a, b);
            } else {
                answer = a * a + b * b;
            }
        }
        return answer;
    }
}