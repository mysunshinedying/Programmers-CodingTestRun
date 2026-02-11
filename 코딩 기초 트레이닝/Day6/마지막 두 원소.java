// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181927

class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l + 1];
        int lb = l - 1;
        int last = 0;
        if(num_list[lb] > num_list[lb-1])
            last = num_list[lb] - num_list[lb-1];
        else
            last = num_list[lb] * 2;

        for(int i = 0; i < l; i++){
            answer[i] = num_list[i];
        }
        answer[l] = last;

        return answer;
    }
}