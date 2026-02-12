// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181922

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int s, e, k;
        int m = 0;

        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        for(int i = 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];

            for(int j = s; j <= e; j++){
                if(j % k == 0){
                    answer[j] += 1;
                }
            }

        }
        return answer;
    }
}