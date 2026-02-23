// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12954

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        if (x == 0) {
            return new long[n];
        }

        for(int i = 0, idx = 0; i < n; i++) {
            answer[i] = (long)(i + 1) * x;
        }

        return answer;
    }
}