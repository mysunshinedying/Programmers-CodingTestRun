// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181917

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean cal1 = true;
        boolean cal2 = true;


        if(!x1 && !x2)
            cal1 = false;

        if(!x3 && !x4)
            cal2 = false;

        if(cal1 && cal2)
            answer = true;

        else
            answer = false;

        return answer;
    }
}