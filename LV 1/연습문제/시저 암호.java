// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        char[] cha = s.toCharArray();

        for(int i = 0; i < cha.length; i++){
            if(cha[i] == ' '){
                continue;
            }
            char base = (cha[i] >= 'a') ? 'z' : 'Z';

            cha[i] = (char)(cha[i] + n);
            if(cha[i] > base) { cha[i] -= 26; }
        }

        return new String(cha);
    }
}