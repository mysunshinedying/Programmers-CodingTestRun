// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181844

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList <Integer> list = new ArrayList<>();

        for(int num : arr){
            list.add(num);
        }

        for(int num : delete_list){
            list.remove(Integer.valueOf(num));
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}