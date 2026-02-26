// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181851

import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                map.put(rank[i],i);
                list.add(rank[i]);
            }
        }

        Collections.sort(list);
        int answer = map.get(list.get(0)) * 10000 + map.get(list.get(1)) * 100 + map.get(list.get(2));

        return answer;
    }
}