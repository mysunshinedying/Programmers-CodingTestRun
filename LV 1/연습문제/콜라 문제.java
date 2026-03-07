// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/132267

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;


        while(n >= a){
            int cola = n % a;
            n /= a;
            n *= b;
            answer += n;
            n += cola;
        }

        return answer;

    }
}