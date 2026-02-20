// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181881

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];

        while(!Arrays.equals(arr,arr2)) {
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];

                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = (arr[i] * 2) + 1;
                }
            }
            if(Arrays.equals(arr,arr2)) break;
            answer++;
        }

        return answer;
    }
}