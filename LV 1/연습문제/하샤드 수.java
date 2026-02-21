// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Solution {
    public boolean solution(int x) {

        int i = x;
        int sum = 0;

        while(i > 0) {
            sum += i % 10;
            i /= 10;
        }


        return x % sum == 0;
    }
}