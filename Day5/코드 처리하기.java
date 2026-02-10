// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181932

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char codeidx;
        for(int i = 0; i<code.length(); i++){
            codeidx = code.charAt(i);
            if(codeidx == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if(mode == 0){
                if(i % 2 == 0){
                    answer += codeidx;
                }
            } else {
                if(i%2 == 1){
                    answer += codeidx;
                }
            }
        }

        return answer == "" ? "EMPTY": answer;
    }
}