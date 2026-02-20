// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181879

class Solution {
    public int solution(int[] num_list) {

        if (num_list.length >= 11) {
            int answer = 0;
            for (int n : num_list) {
                answer += n;
            }
            return answer;
        } else {
            int answer = 1;
            for (int n : num_list) {
                answer *= n;
            }
            return answer;
        }

    }
}