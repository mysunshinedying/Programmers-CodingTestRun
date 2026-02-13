//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/181916

import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        if(arr[0] == arr[3]) //min=max 동일
            answer += arr[0] * 1111;

        else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[3])
            answer += arr[0];

        else if(arr[0] != arr[3] && arr[1] == arr[2]) {
            if(arr[0] == arr[2] || arr[1] == arr[3]){
                if(arr[0] == arr[1])
                    answer = (int)(Math.pow((10 * arr[0] + arr[3]),2));
                else if(arr[3] == arr[1])
                    answer = (int)(Math.pow((10 * arr[3] + arr[0]),2));
            } else {
                answer = (arr[3] * arr[0]);
            }
        } else {
            if(arr[1] == arr[0] && arr[2] == arr[3])
                answer = (arr[3] + arr[0]) * (arr[3] - arr[0]);
            else
            if(arr[1] != arr[0])
                answer = arr[0] * arr[1];
            else
                answer = arr[2] * arr[3];
        }

        // a,p,p,p 일 경우 min값과 max값이 다름 다만 가운데값은 동일, min이나 max와 가운데값이 동일함()
        // a,a,p,p일 경우 min값과 max값이 다르고 가운데값도 끼리도 다름 다만 가운데값이 min이나 max와 같을 수 있음
        // a,a,p,q의 경우 min값과 max값이 다르고 가운데값은 같을 수 있거나 다를 수 있음
        // a,b,c,d의 경우 전체 값이 다름 min max 가운데값이 전부 다름

        // a,b / b,c / c,d / a,d의 max값과 min값에 대해
        // a,b max값 = min값 true = 같은값

        // a,a,p,p / a,p,p,a / a,a,p,p / p,p,a,a / p,a,p,a / p,a,a,p (6개)
        // a,a,p,q / a,p,a,q / a,p,q,a / a,q,a,p / a,q,p,a
        // p,a,a,q / p,a,q,a / p,q,a,a (8개)


        return answer;
    }
}