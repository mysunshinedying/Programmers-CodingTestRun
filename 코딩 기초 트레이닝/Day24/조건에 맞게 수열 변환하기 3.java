// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181835

class Solution {
    public int[] solution(int[] arr, int k) {
        boolean even = (k % 2 == 0);
        for(int i = 0; i <  arr.length; i++){
            if(even){
                arr[i] += k;
            } else {
                arr[i] *= k;
            }
        }
        return arr;
    }
}