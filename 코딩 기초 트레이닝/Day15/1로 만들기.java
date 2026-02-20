// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181880

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            answer += (int) (Math.log(num_list[i]) / Math.log(2));
        }
        return answer;
    }
}