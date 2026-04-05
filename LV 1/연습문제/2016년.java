// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12901

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; //fri를 0부터 세는쪽이 낫다
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //month의 days 만들기
        int days = -1;

        for(int i = 0; i < a; i++){
            days += month[i];
        }
        days += b;

        return day[(days % 7)];

    }


}