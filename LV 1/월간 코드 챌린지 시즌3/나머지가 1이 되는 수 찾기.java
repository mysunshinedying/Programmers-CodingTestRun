// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/87389

class Solution {
    public int solution(int n) {
        int answer = 0;
        long quo = Math.round(Math.sqrt(n - 1));

        if (n % 2 == 1) return 2;

        if(quo * quo == n -1) {
            return (int)quo;
        }

        for(int i = 3; i <= (n - 1) / 2; i++) {
            if((n - 1) % i == 0) {
                return i;
            }
        }

        return n - 1;

    }
}

