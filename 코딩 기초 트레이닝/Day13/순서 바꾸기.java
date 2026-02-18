// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181891

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int j = 0;

        answer = new int[num_list.length];

        for(int i = n; i < answer.length; i++){
            answer[j++] = num_list[i];
        }

        for(int i = 0; i < n; i++){
            answer[j++] = num_list[i];
        }


        return answer;
    }
}