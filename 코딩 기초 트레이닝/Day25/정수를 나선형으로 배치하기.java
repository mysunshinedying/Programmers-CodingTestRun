// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181832

class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        int k = 0;
        int idx = 1;

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while(top <= bottom && left <= right){
            for(int c = left; c<= right; c++) { answer[top][c] = idx; idx++; }
            top++;
            for(int r = top; r <= bottom; r++) { answer[r][right] = idx; idx++; }
            right--;
            for(int c = right; c >= left; c--) { answer[bottom][c] = idx; idx++; }
            bottom--;
            for(int r = bottom; r >= top; r--) { answer[r][left] = idx; idx++; }
            left++;

        }

        return answer;
    }
}