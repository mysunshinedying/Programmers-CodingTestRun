// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181837

class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for(String menu : order){
            if(menu.contains("cafelatte")){
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}