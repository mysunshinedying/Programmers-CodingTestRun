// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181913

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;

        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int idx = e - s + 1;

            for(int j = 0; j < idx / 2; j++){
                int idxa = s + j;
                int idxb = e - j;

                char a = answer.charAt(idxa);
                char b = answer.charAt(idxb);

                answer = answer.substring(0, (idxa)) + b + answer.substring(idxa + 1,idxb) + a + answer.substring(idxb + 1);

            }

        }


        return answer;
    }
}