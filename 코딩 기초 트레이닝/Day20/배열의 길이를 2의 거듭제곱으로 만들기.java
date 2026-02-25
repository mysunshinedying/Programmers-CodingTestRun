// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181857

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int qstr = (int) (Math.ceil(Math.log(arr.length) / Math.log(2)));
        int l = (int) (Math.pow(2, qstr));
        answer = new int[l];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}