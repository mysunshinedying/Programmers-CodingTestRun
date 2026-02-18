// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181890

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        for(int i = 0; i < str_list.length; i++) {

            if(str_list[i].equals("l")) {
                if(i == 0) {
                    return answer;
                }
                answer = new String[i];
                for(int j = 0; j < answer.length; j++) {
                    answer[j] = str_list[j];
                }
                break;
            } else if(str_list[i].equals("r")) {
                if(i == (str_list.length - 1)) {
                    return answer;
                }
                answer = new String[(str_list.length - i - 1)];
                for(int j = 0; j < answer.length; j++){
                    answer[j] = str_list[(i + j + 1)];
                }
                break;
            }
        }

        return answer;
    }
}