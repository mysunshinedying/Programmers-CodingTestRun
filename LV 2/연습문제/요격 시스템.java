// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181188

import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        // 정렬
        Arrays.sort(targets, (o1, o2) -> Integer.compare(o1[1], o2[1]));

        long x = -1;
        for(int i = 0; i < targets.length; i++) {
            if(targets[i][0] >= x){
                answer++;
                x = targets[i][1];
            }
        }

        return answer;
    }
}