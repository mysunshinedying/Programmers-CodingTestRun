// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181924

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int queryI, queryJ;
        int a, b;

        for(int i = 0; i < queries.length; i++){
            //둘이 서로 바뀌는 형태이기 때문에 queries의 이중배열은 2개만 존재한다
            queryI = queries[i][0];
            queryJ = queries[i][1];

            a = arr[queryI];
            b = arr[queryJ];

            arr[queryJ] = a;
            arr[queryI] = b;
        }

        return arr;
    }
}