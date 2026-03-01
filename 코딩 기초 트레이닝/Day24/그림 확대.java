// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181836

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length * k];
        int idx = 0;

        for(int i = 0; i < picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < picture[i].length(); j++){
                char c = picture[i].charAt(j);
                for(int n = 0; n < k; n++){
                    sb.append(c);
                }
            }
            for(int n = 0; n < k; n++){
                answer[idx++] = sb.toString();
            }
        }

        return answer;
    }
}