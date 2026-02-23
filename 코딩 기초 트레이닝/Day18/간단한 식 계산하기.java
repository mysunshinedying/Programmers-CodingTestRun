// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181865

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] math = binomial.split(" ");
        int a = Integer.parseInt(math[0]);
        int b = Integer.parseInt(math[2]);
        switch(math[1]) {
            case "+" : answer = a + b; break;
            case "*" : answer = a * b; break;
            case "-" : answer = a - b; break;
        }

        return answer;
    }
}