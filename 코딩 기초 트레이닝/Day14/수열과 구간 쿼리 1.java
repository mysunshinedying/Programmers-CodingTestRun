// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181883

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s = 0, e = 1;

        for(int i = 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];

            for(int j = s; j <= e; j++) {
                arr[j]++;
            }

        }

        return arr;
    }
}