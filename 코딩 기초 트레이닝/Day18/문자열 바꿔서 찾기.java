// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181864

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace("A","C");
        myString = myString.replace("B","A");
        myString = myString.replace("C","B");
        if(myString.indexOf(pat) != -1) return 1;

        return answer;
    }
}