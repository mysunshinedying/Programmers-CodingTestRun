// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181830

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if(arr.length > arr[0].length) {
            answer = new int[arr.length][arr.length];
        } else {
            answer = new int[arr[0].length][arr[0].length];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}