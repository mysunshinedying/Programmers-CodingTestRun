// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181859

import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else {
                if (stk.peek().equals(arr[i])) {
                    stk.pop();
                } else {
                    stk.push(arr[i]);
                }
            }

        }
        if (stk.isEmpty()) return new int[]{-1};

        answer = new int[stk.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stk.get(i);
        }

        return answer;
    }
}