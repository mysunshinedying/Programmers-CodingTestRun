//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181901

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {

        int[] answer = {};

        int idx = n / k;
        answer = new int[idx];


        for(int i = 0; i < idx; i++){
            answer[i] = (i + 1) * k;
        }

        Arrays.sort(answer);

        return answer;
    }
}