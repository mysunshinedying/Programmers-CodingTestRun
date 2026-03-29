// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12973

import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 1;

        Deque<Character> alpha = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(alpha.isEmpty()) {
                alpha.offerLast(c);
            } else {
                if(c == alpha.peekLast()){
                    alpha.pollLast();
                } else {
                    alpha.offerLast(c);
                }
            }
        }

        if(!alpha.isEmpty()) answer = 0;


        return answer;
    }
}