// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181889

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        answer = Arrays.copyOfRange(num_list, 0, n);

        return answer;
    }
}