// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181905

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr;
        arr = my_string.toCharArray();

        while(s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }

        answer = new String(arr);

        return answer;
    }
}