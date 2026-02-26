// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181846

// 1번 풀이: BigInteger 사용 풀이
import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger sum = A.add(B);

        return sum.toString();
    }
}

// 2번 풀이: BigInteger의 연산 속도로 인한 제2의 풀이.

class Solution2 {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1;
        int rest = 0;

        while(i >= 0 || j >= 0 || rest > 0){
            int sum = rest;

            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 10);
            rest = sum / 10;
        }

        return sb.reverse().toString();

    }
}