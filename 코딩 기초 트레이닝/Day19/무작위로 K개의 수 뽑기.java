// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181858

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            if (set.size() < k) {
                set.add(num);
            }
        }

        int[] answer = {};
        answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }

        int idx = 0;

        for (int num : set) {
            answer[idx++] = num;
        }

        return answer;
    }
}