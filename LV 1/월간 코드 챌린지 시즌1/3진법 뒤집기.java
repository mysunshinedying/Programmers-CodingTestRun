// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/68935

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n,3));

        return Integer.parseInt(sb.reverse().toString(),3);
    }
}