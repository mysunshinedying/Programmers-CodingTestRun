// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181928

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evens = "";
        String odds = "";
        for (int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                evens += "" + num_list[i];
            } else {
                odds += "" + num_list[i];
            }
        }
        answer = Integer.parseInt(evens) + Integer.parseInt(odds);
        return answer;
    }
}