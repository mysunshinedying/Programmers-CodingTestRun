// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42746

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];

        for(int i = 0; i < strNumbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

           if(strNumbers[0].equals("0")) {
                return "0";
            }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strNumbers.length; i++){

            sb.append(strNumbers[i]);
        }

        return sb.toString();
    }
}