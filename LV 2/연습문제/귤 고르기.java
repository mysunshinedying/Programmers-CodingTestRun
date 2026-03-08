// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/138476

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int arr[] = new int[10000001];
        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;
        for(int i = 0; i < tangerine.length; i++){
            arr[tangerine[i]]++;
            max = Math.max(max, tangerine[i]);
        }

        for(int i = 0 ; i < max + 1; i++){
            if(arr[i] > 0){
                list.add(arr[i]);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int num : list){
            k-=num;
            answer++;

            if(k <= 0) {
                break;
            }
        }

        return answer;
    }
}