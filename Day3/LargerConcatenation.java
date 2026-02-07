// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181939

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int case1 = Integer.parseInt("" + a + b); //더 좋은 해답
        int case2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a)); //원본 사용
        answer = Math.max(case1, case2);
        return answer;
    }
}