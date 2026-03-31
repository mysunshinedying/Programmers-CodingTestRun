// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/176963

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        answer = new int[photo.length];
        List<String> name2 = Arrays.asList(name);

        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                int idx = name2.indexOf(photo[i][j]);
                if(idx != -1){
                    answer[i] += yearning[idx];
                }

            }
        }

        return answer;
    }
}