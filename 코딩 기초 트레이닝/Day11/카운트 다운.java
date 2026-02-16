// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181899

import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};

        int idx = start_num - end_num + 1;
        answer = new int[idx];

        for(int i = 0; i < idx; i++){
            answer[i] = start_num - i;
        }


        return answer;
    }
}