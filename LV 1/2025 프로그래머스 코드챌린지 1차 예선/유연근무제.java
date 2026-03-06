// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/388351
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length; //거꾸로 센다

        //1일 월요일 뭐 그러니까

        for(int i = 0; i < schedules.length; i++){
            int hour = schedules[i] / 100; //시
            int min = schedules[i] % 100; //분
            min += 10; //10분 더한다

            if(min >= 60) { hour += 1; min -= 60; }
            //자정 이상은 카운팅하지 않아도 될듯?

            int limit = hour * 100 + min; //제한 출근 시간

            for(int j = 0; j < timelogs[i].length; j++){
                int weekDay = j + startday;
                if(weekDay > 7) weekDay = weekDay - 7;

                if(weekDay == 6 || weekDay == 7) continue;

                if(timelogs[i][j] > limit) { //지각할 경우
                    answer--;
                    break;
                }
            }
        }


        return answer;
    }
}