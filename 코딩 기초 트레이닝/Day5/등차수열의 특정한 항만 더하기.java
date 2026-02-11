// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181931

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sequence = a;
        if(included[0])
            answer += a;

        for(int i = 1; i<included.length; i++){
            sequence += d;
            if(included[i]){
                answer += sequence;
            }
        }
        return answer;
    }
}