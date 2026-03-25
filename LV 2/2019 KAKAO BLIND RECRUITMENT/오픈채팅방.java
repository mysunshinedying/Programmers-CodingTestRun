// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42888

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        String[][] commandList = new String[record.length][];

        HashMap<String,String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < commandList.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i]);
            String command = st.nextToken();
            String id = st.nextToken();

            if(st.hasMoreTokens()) {
                map.put(id, st.nextToken());
            }

            commandList[i] = new String[2];
            commandList[i][0] = id;
            commandList[i][1] = command;
        }

        for(String[] str : commandList) {

            switch(str[1]){
                case "Enter" : sb.append(map.get(str[0])).append("님이 들어왔습니다.").append(":");
                    break;
                case "Leave" : sb.append(map.get(str[0])).append("님이 나갔습니다.").append(":");
                    break;
            }

        }

        answer = sb.toString().split(":");



        return answer;
    }
}