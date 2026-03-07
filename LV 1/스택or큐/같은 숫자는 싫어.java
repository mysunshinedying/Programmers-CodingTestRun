// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        Deque<Integer> stack = new ArrayDeque<>();
        for(int num : arr){
            if(stack.isEmpty() || stack.peek() != num){
                stack.push(num);
            }
        }

        answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = stack.pollLast();
        }

        return answer;
    }
}