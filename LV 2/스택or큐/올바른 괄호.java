// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12909

import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){

            if(c == '('){
                stack.push(c);
            } else {
                if(stack.isEmpty()) { return false; }
                char top = stack.pop();
            }
        }
        return stack.isEmpty();
    }
}