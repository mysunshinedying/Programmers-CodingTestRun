// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181923

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int s, e, k;
        int min;

        for(int i = 0; i<queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            min = -1;

            for (int j = s; j <= e; j++){
                if(arr[j] > k){
                    if(min == -1 || min > arr[j])
                        min = arr[j];
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}