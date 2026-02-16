// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181900

import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        int index = 0;

        Arrays.sort(indices);

        for(int i = 0; i < indices.length; i++) {
            index = indices[i] - i;
            answer.deleteCharAt(index);
        }

        return answer + "";
    }
}