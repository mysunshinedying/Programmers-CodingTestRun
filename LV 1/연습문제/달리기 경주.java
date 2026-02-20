// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/178871

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        answer = new String[players.length];
        Map<String,Integer> map = new HashMap<String,Integer>();

        for(int i = 0; i < players.length; i++) {
            map.put(players[i],i);
        }

        for(int i = 0; i < callings.length; i++) {
            int idx = map.get(callings[i]);
            map.put(callings[i], idx - 1);
            map.put(players[idx - 1], idx);

            String before = players[idx];
            players[idx] = players[idx - 1];
            players[idx - 1] = before;
        }

        for(String key : map.keySet()) {
            answer[map.get(key)] = key;
        }

        return answer;
    }
}