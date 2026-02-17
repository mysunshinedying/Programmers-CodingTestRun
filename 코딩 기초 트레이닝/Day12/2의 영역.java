// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181894

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min_two = 0, max_two = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min_two = i;
                break;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                max_two = i;
            }
        }

        answer = new int[max_two - min_two + 1];
        if(min_two == 0 && max_two == 0) {
            answer[0] = -1;
        } else {

            for(int i = min_two; i <= max_two; i++) {
                answer[i - min_two] = arr[i];
            }
        }


        return answer;
    }
}