// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
}