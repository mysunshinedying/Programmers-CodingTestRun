// 문제 : https://school.programmers.co.kr/learn/courses/18/lessons/1882

import java.util.*;

class Solution {
    public int solution(String[] strs, String t) {
        int answer = 0;

        ArrayList<String> [] keyword = new ArrayList[6];
        for(int i = 1; i <= 5; i++){
            keyword[i] = new ArrayList<>();
        }

        for(String str : strs){
            keyword[str.length()].add(str);
        }
        // 생성

        int[] arr = new int[t.length() + 1];
        Arrays.fill(arr, 20001);
        arr[t.length()] = 0;

        //DP 역산
        for(int i = t.length() - 1; i >= 0; i--){
            for(int j = 1; j <= 5; j++){
                if(i + j <= t.length()){
                    for(String word : keyword[j]){
                        if(t.startsWith(word, i)){
                            arr[i] = Math.min(arr[i], arr[i + j] + 1);
                        }
                    }
                }
            }
        }


        return arr[0] == 20001 ? -1 : arr[0];
    }
}