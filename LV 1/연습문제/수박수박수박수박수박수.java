// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12922
class Solution {
    public String solution(int n) {
        String answer = "";
        String str = "수박";

        answer = str.repeat(n / 2);
        answer += n % 2 == 1 ? "수" : "";

        return answer;
    }
}