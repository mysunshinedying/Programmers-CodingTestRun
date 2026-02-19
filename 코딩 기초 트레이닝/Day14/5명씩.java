// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181886

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        answer = new String[1 + (names.length - 1) / 5];

        for(int i = 0, j = 0; i < answer.length; i++){
            answer[i] = names[j];
            j +=5;
        }

        return answer;
    }
}