// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181919
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);

        while(true){
            if(n % 2 == 0){
                n = n / 2;
                list.add(n);
            } else {
                n = 3 * n + 1;
                list.add(n);
            }
            if(n == 1) break;
        }

        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}