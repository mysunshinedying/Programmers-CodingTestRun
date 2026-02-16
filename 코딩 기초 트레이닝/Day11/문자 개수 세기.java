// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181902
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = new int[52];
        int index = 0;

        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);

            if(Character.isUpperCase(ch)){
                index = (int)(ch - 'A');
            } else {
                index = (int)(ch - 'a' + 26);
            }

            answer[index]++;

        }

        return answer;
    }
}