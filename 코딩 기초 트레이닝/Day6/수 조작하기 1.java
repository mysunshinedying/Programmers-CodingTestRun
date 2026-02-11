// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181926

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        int num = control.length();
        char a;

        for(int i = 0; i<num; i++){
            a = control.charAt(i);

            switch(a){
                case 'w' : answer += 1; break;
                case 's' : answer -= 1; break;
                case 'd' : answer += 10; break;
                case 'a' : answer -= 10; break;
                default : answer = answer;
            }
        }

        return answer;
    }
}