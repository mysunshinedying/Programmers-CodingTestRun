// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181867

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] str = myString.split("x");
        ArrayList <String> list = new ArrayList<>(Arrays.asList(str));
        if(myString.endsWith("x")) list.add("");
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).length();
        }
        return answer;
    }
}