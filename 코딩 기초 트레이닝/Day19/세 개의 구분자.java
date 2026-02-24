// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181862

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        myStr = myStr.replace("b", "a").replace("c", "a");
        answer = myStr.split("a");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(answer));

        list.removeAll(Arrays.asList("", null));

        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return list.toArray(new String[0]);
    }
}