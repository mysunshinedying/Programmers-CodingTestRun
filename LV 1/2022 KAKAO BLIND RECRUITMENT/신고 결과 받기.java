//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;

class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int len = id_list.length;
        boolean[][] report2 = new boolean[len][len];

        for(int i = 0; i < report.length; i++){
            StringTokenizer st = new StringTokenizer(report[i]);
            int n1 = reportInt(st.nextToken(), id_list);
            int n2 = reportInt(st.nextToken(), id_list);
            //신고당한 사람 n2가 앞, n1이 뒤
            report2[n2][n1] = true;
        }

        for(int i = 0; i < report2.length; i++){
            int reports = 0;
            //true의 횟수를 셀것
            for(int j = 0; j < report2[i].length; j++){
                if(report2[i][j] == true){
                    reports++;
                }
            }

            if(reports >= k){
                for(int j = 0; j < report2[i].length; j++){
                    if(report2[i][j] == true){
                        answer[j] += 1;
                    }
                }
            }
        }

        return answer;
    }

    public int reportInt(String name, String[] id_list){
        for(int i = 0; i < id_list.length; i++){
            if(id_list[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
}