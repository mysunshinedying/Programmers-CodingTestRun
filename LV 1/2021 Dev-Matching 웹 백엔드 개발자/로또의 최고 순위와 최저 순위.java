// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/77484

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2]; //최고 or 최저밖에 없음

        int count = 0; //맞는 개수
        int zero = 0; //0의 개수


        for(int num : lottos){
            if(num == 0) { zero++; }
            for(int wins : win_nums) {
                if(num == wins) {
                    count++;
                }
            }
        }


        answer[0] = (7 - (count + zero)) > 6 ? 6 : 7 - (count + zero);
        answer[1] = (7 - count) > 6 ? 6 : 7 - count;

        return answer;
    }
}