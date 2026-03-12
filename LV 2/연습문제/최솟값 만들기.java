// 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int i = 0;
        int j = B.length - 1;

        while(i < A.length && j >= 0){

            answer += A[i] * B[j];

            i++;
            j--;
        }


        return answer;
    }
}