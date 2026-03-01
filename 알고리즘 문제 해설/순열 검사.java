// 문제 :https://school.programmers.co.kr/learn/courses/18/lessons/1877

class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;

        boolean[] flag = new boolean[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 1 || arr[i] > arr.length) {
                return false;
            }

            if(flag[arr[i]]){
                answer = false;
                break;
            } else {
                flag[arr[i]] = true;
            }
        }

        return answer;
    }
}