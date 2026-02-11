// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181925

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int m;

        for(int i = 1; i< numLog.length; i++){
            m = numLog[i] - numLog[i - 1];
            switch(m)
            {
                case 1 : answer += "w"; break;
                case -1 : answer += "s"; break;
                case 10 : answer += "d"; break;
                case -10 : answer += "a"; break;
                default : answer = answer;
            }
        }

        return answer;
    }
}