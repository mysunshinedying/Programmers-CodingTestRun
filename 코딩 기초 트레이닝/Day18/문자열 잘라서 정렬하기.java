// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181866

import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myString) {

        String[] answer = myString.split("x");

        Arrays.sort(answer);
        ArrayList <String> list = new ArrayList<>(Arrays.asList(answer));

        list.removeAll(Arrays.asList("",null));

        return list.toArray(new String[0]);
    }
}