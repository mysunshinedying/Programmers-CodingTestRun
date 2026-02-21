// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12934

class Solution {
    public long solution(long n) {
        long answer = 0;
        double nsqrt = Math.sqrt(n);
        answer = Math.round(nsqrt);
        if(answer * answer != n) {
            return -1;
        }

        return (answer + 1) * (answer + 1);
    }
}