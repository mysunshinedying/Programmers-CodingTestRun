// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] num = String.valueOf(n).toCharArray();

        Arrays.sort(num);

        for(int i = num.length - 1; i >= 0; i--) {
            answer += (long)(Math.pow(10, i) * (num[i] - '0'));
        }

        return answer;
    }
}