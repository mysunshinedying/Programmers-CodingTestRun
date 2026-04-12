// 문제 :https://school.programmers.co.kr/learn/courses/30/lessons/147355

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int len = p.length();
        for(int i = 0; i <= t.length() - len; i++){
            String num = t.substring(i,i + len);
            if(p.compareTo(num) >= 0){
                answer++;
            }
        }

        return answer;
    }
}