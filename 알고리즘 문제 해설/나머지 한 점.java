// 문제 : https://school.programmers.co.kr/learn/courses/18/lessons/1878

class Solution {
    public int[] solution(int[][] v) {
        //v[0][0], v[0][1], v[1][0], v[1][1], v[2][0], v[2][1]
        //if 처리했는데 비트연산이라는 게 있어서 사용해봄.

        int x = v[0][0] ^ v[1][0] ^ v[2][0];
        int y = v[0][1] ^ v[1][1] ^ v[2][1];

        return new int[] {x,y};
    }
}