// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181870

import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}