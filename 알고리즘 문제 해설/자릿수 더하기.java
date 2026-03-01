// 문제 : https://school.programmers.co.kr/learn/courses/18/lessons/1876

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }


        return answer;
    }
}