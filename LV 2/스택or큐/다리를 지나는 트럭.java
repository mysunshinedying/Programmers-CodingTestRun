// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42583

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque <Integer> bridge = new ArrayDeque<>();
        int currentWeight = 0;
        int idx = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.addLast(0);
        }
        while (idx < truck_weights.length || currentWeight > 0) {
            answer++;
            int out = bridge.pollFirst();
            currentWeight -= out;

            if (idx < truck_weights.length) {
                int nextTruck = truck_weights[idx];
                if (currentWeight + nextTruck <= weight) {
                    bridge.addLast(nextTruck);
                    currentWeight += nextTruck;
                    idx++;
                } else {
                    bridge.addLast(0);
                }
            } else {
                bridge.addLast(0);
            }
        }

        return answer;
    }
}