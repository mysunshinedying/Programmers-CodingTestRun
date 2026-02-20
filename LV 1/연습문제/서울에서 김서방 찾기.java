// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12919
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int location = 0;
        for(int i = 0; i<seoul.length; i++){
            if("Kim".equals(seoul[i]))
                location = i;
        }
        answer = "김서방은 " + location + "에 있다";
        return answer;
    }
}