// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181935
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){ //짝수일 경우
            for(int i = 0; i<=n; i+=2){
                answer += i * i;
            }
        } else { //홀수일 경우
            for(int i = 1; i<=n; i+=2){
                answer += i;
            }
        }
        return answer;
    }
}