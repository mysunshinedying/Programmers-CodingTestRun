// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42626?language=java

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int s : scoville) {
            minHeap.offer(s);
        }

        while(minHeap.peek() < K) {
            if(minHeap.size() < 2) {
                answer = -1;
                break;
            }

            int a = minHeap.poll();
            int b = minHeap.poll();
            minHeap.offer(a + (b * 2));

            answer++;
        }


        return answer;
    }
}