// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181921
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        String c = "";
        for(int i = l; i <= r; i++){
            c = "" + i;
            boolean valid = true;
            for(int j = 0; j < c.length(); j++){
                if(c.charAt(j) != '0' && c.charAt(j) != '5'){
                    valid = false;
                    continue;
                }
            }
            if(valid){
                list.add(i);
            }
        }
        if(list.size() > 0) {
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        } else {
            answer = new int[]{-1};
        }

        return answer;
    }
}