// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181893

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int query_idx = 0;
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        for(int idx : arr){
            list.add(idx);
        }

        for(int i = 0; i < query.length; i++){
            query_idx = query[i];

            if(i % 2 == 0) { //짝수라면
                for(int j = (list.size() - 1); j > query_idx; j--) {
                    list.remove(j);
                }

            } else { //홀수라면
                for(int j = (query_idx - 1); j >= 0; j--) {
                    list.remove(j);
                }
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}