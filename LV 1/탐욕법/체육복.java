// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] student = new int[n + 1]; //student 넣기


        for(int i = 0; i < lost.length; i++){
            student[lost[i]] -= 1;
        }

        for(int i = 0; i < reserve.length; i++){
            student[reserve[i]] += 1;
        }

        // 이렇게 하면 이제 본인만 가진 애들은 0, 있는 애는 1, 없는 애는 -1이 된다.
        //학생 번호는 1부터 시작함을 잊지X

        for(int i = 1; i < student.length - 1; i++){
            if(student[i] == -1 && student[i + 1] == 1) {
                student[i] += 1;
                student[i + 1] -= 1;
            } else if(student[i] == 1 && student[i + 1] == -1) {
                student[i] -= 1;
                student[i + 1] += 1;
            }
        }

        for(int i = 1; i < student.length; i++){
            if(student[i] != -1) {
                answer++;
            }
        }

        return answer;
    }
}