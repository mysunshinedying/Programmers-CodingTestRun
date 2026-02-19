// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181885

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int l = 0;

        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]) {
                l++;
            }
        }

        answer = new String[l];

        for(int i = 0, j = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer[j++] = todo_list[i];
            }
        }

        return answer;
    }
}