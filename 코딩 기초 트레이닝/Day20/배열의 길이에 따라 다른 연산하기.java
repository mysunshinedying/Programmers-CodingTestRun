// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181854

class Solution {
    public int[] solution(int[] arr, int n) {

        int i = 0;

        if (arr.length % 2 == 0)
            i = 1;
        else
            i = 0;
        for (i = i; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }
}