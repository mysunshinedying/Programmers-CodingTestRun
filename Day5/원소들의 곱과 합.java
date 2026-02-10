//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181929

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int numlistPlus = 0;
        int numlistMulti = 1;

        for(int i = 0; i<num_list.length; i++){
            numlistPlus += num_list[i];
            numlistMulti *= num_list[i];
        }
        numlistPlus = (int)Math.pow(numlistPlus,2);

        if(numlistPlus > numlistMulti)
            answer = 1;

        return answer;
    }
}