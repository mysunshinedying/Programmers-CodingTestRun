// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181904

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        int len = my_string.length();
        char arr[][] = new char[(len / m)][m]; //약수로만 된다고 하였으니 나머지는 신경쓰지 않아도 된다.

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < m; j++){
                arr[i][j] = my_string.charAt(i * m + j);
            }
            answer += arr[i][c-1];
        }

        return answer;
    }
}