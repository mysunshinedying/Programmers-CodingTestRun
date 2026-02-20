// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181880

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            int idx = 1;
            while(Math.pow(2,idx) <= num_list[i]) {
                idx++;
                answer++;
            }
        }
        return answer;
    }
}