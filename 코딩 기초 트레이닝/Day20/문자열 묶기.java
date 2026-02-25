// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181855

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < strArr.length; i++) {
            int l = strArr[i].length();
            int before = map.getOrDefault(l, 0);
            map.put(l, before + 1);
        }

        answer = Collections.max(map.values());

        return answer;
    }
}