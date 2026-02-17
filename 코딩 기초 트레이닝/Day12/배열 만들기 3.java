class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int s = intervals[0][1] - intervals[0][0] + 1;
        int e = intervals[1][1] - intervals[1][0] + 1;

        answer = new int[(s + e)];

        for (int i = 0; i < intervals.length; i++) {
            int query_max = intervals[i][1];
            int query_min = intervals[i][0];
            for(int j = query_min; j <= query_max; j++){
                answer[(s * i + j - query_min)] = arr[j];
            }

        }

        /*
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[i - intervals[0][0]] = arr[i];
        }

        for(int i = intervals[1][0]; i<= intervals[1][1]; i++) {
            answer[(s + i - intervals[1][0])] = arr[i];
        }
        */


        return answer;
    }
}