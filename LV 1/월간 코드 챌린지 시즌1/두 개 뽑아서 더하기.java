// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/68644

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        boolean[] isNum = new boolean[201];

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int idx = numbers[i] + numbers[j];
                isNum[idx] = true;
            }
        }

        int count = 0;

        for(boolean yes : isNum){
            if(yes) {
                count++;
            }
        }

        answer = new int[count];

        for(int i = 0, j = 0; i < isNum.length; i++){
            if(isNum[i]){
                answer[j++] = i;
            }
        }

        return answer;
    }
}