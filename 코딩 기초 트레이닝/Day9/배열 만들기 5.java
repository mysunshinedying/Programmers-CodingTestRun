// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181912

import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        int intStr;

        for(String str : intStrs) {
            intStr = Integer.parseInt(str.substring(s, (s + l)));
            if(intStr > k) {
                list.add(intStr);
            }
        }

        if(list.size() > 0) {
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}