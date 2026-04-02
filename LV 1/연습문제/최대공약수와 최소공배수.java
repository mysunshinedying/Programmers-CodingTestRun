// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12940

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        //최대공약수부터 구해야함
        int min = Math.min(n,m); //최소수를 지정 -> 최대공약수는 최소수를 넘어가지 않음
        int mingon = 1;

        for(int i = min; i >= 1; i--){ //min에서 시작
            if(n % i == 0 && m % i == 0){
                mingon = i;
                break;
            }
        }

        answer[0] = mingon;
        answer[1] = (n / mingon) * (m / mingon) * mingon;


        return answer;
    }
}