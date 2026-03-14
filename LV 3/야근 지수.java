// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12927

import java.util.Arrays;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        Arrays.sort(works);

        int len = works.length;

        while(n > 0) {
            if(works[len - 1] == 0) return 0;

            works[len - 1]--;

            int idx = len - 1;
            while (idx > 0 && works[idx] < works[idx - 1]) {
                int temp = works[idx];
                works[idx] = works[idx - 1];
                works[idx - 1] = temp;
                idx--;
            }
            n--;
        }

        for(int num : works){
            answer += (long)num * num;
        }


        return answer;
    }
}