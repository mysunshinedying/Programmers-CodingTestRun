// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181888

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        answer = new int[1 + ((num_list.length - 1) / n)];

        for(int i = 0, j = 0; i < num_list.length; i += n) {
            answer[j++] = num_list[i];
        }

        return answer;
    }
}