// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/131127
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        //자신의 날짜부터 비교
        //맞다면 그 다음 날 비교
        //맞다면 그다음날….
        // 기준은 5일까지만 체크해도 OK

        //for문 기준은 날짜가 될 것이다.
        //그리고 want랑 number왜 나눠놨냐 헷갈리게

        List <String> list = Arrays.asList(want);


        for(int i = 0; i < discount.length - 9; i++){
            //이후로 기준날짜 i로부터 +9까지를 확인한다.
            //자기부터 확인.
            boolean isDiscountOk = true;
            int[] tempNumber = new int[number.length];
            System.arraycopy(number, 0, tempNumber, 0, number.length);

            for(int j = i; j < (i + 10); j++){
                //chiken의 날

                int idx = list.indexOf(discount[j]); //number idx를 구한다  -1

                if(idx == -1)
                    { isDiscountOk = false; break; } //idx가 못찾으면 break 처리, 그날은 없음.
                else {
                    //찾았는데 개수가 없으면 break, 그날은 불가능.
                    if(tempNumber[idx] == 0)
                        { isDiscountOk = false;
                          break; }
                    else tempNumber[idx]--;
                }
            }

            for(int num : tempNumber){
                if(num != 0) {
                    isDiscountOk = false;
                    break;
                }
            }

            if(isDiscountOk) {
                answer++;
            }

        } //기준 날짜를 본다

        return answer;
    }
}