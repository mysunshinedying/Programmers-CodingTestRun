// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = (int)Math.max(a,b);
        int min = (int)Math.min(a,b);

        answer = (long)(max + min) * (max - min + 1) / 2;

        return answer;
    }
}