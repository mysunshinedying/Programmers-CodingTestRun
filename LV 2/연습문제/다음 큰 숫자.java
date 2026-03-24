// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12911#

import java.util.Arrays;
class Solution {

    //솔루션1. Array등의 사용.

        public int solution(int n) {

            int twoMath = 0;
            for (int i = 0; i < 20; i++) {
                twoMath = (int) Math.pow(2, i);
                if (n < twoMath) {
                    break;
                }
            }

            String b = Integer.toBinaryString(n);
            String b2 = Integer.toBinaryString(twoMath);
            char[] nBinary = new char[b2.length()];
            Arrays.fill(nBinary, '0');

            int start = nBinary.length - b.length();
            for (int i = 0; i < b.length(); i++) {
                nBinary[start + i] = b.charAt(i);
            }

            char[] binary = Arrays.copyOf(nBinary, nBinary.length);
            int idx = -1;

            for (int i = nBinary.length - 1; i >= 1; i--) {
                if (nBinary[i] == '1' && nBinary[i - 1] == '0') {
                    binary[i - 1] = '1';
                    idx = i;
                    break;
                }
            }

            if (idx != -1) {
                binary[idx] = '0';

                int countOne = 0;
                for (int i = idx + 1; i < nBinary.length; i++) {
                    binary[i] = '0';
                    if (nBinary[i] == '1') countOne++;
                }

                for (int i = binary.length - 1; i > idx && countOne > 0; i--) {
                    binary[i] = '1';
                    countOne--;
                }
            }

            return Integer.parseInt(new String(binary), 2);
        }

    //솔루션2. 비트연산. 이쪽이 더 빠르다.
    //이쪽은 하다가 떠올라서 해본 방법....
    public int solution(int n) {
        //핵심은 01을 10으로 바꾸고 수를 맞추는 맞추는 것.
        int c = n;
        int c0 = 0;
        int c1 = 0;

        while (((c & 1) == 0) && (c != 0)) {
            c0++;
            c >>= 1;
        }

        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }

        int p = c0 + c1;
        //비트 연산식 찾아보느라 힘들었다
        n |= (1 << p);
        n &= ~((1 << p) - 1);
        n |= (1 << (c1 - 1)) - 1;

        return n;
    }
}