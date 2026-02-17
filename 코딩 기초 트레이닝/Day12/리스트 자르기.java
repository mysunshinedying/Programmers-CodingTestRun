// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181897

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int start = 0;
        int end = num_list.length - 1;
        int step = 1;

        int a = slicer[0], b = slicer[1], c = slicer[2];


        switch(n) {
            case 1 :
                end = b; break;
            case 2 :
                start = a; break;
            case 3 :
                start = a;
                end = b;
                break;
            case 4 :
                start = a;
                end = b;
                step = c;
                break;
        }

        answer = new int[(end - start) / step + 1];

        for(int i = 0; i<answer.length; i++) {
            answer[i] = num_list[i * step + start];
        }


        return answer;
    }
}