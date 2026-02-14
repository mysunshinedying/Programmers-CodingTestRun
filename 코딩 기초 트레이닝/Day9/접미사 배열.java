// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181909

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++){
            String str = my_string.substring(i);
            list.add(str);
        }

        answer = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);


        return answer;
    }
}