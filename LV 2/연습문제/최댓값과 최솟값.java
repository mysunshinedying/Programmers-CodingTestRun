// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12939

import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int len = st.countTokens();

        int[] num = new int[len];
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int max = num[0], min = num[0];

        for(int i = 0; i < num.length; i++){
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
        }

        return min + " " + max;
    }
}