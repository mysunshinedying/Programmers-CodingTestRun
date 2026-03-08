// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/150370

import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        // 오늘 쪼개기
        StringTokenizer todays = new StringTokenizer(today, ".");
        //오늘 지정
        int todayYear = Integer.parseInt(todays.nextToken());
        int todayMonth = Integer.parseInt(todays.nextToken());
        int todayDay = Integer.parseInt(todays.nextToken());

        HashMap <Character, Integer> term = new HashMap<>();
        for(String str : terms){
            StringTokenizer st = new StringTokenizer(str);
            char name = st.nextToken().charAt(0);
            int month = Integer.parseInt(st.nextToken());

            term.put(name, month);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < privacies.length; i++){
            StringTokenizer st = new StringTokenizer(privacies[i]);
            StringTokenizer date = new StringTokenizer(st.nextToken(),".");
            int year = Integer.parseInt(date.nextToken());
            int month = Integer.parseInt(date.nextToken());
            int day = Integer.parseInt(date.nextToken());

            char name = st.nextToken().charAt(0);
            int over = term.get(name);

            month += over;
            while(month > 12) {
                year += 1;
                month -= 12;
            }

            if(todayYear > year) { result.add(i + 1); }
            else if (todayYear == year && todayMonth > month) { result.add(i + 1); }
            else if(todayYear == year && todayMonth == month && todayDay >= day) { result.add(i + 1); }
        }

        answer = new int[result.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }


        return answer;
    }
}