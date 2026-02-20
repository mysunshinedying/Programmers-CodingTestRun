// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12985

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        for(int i = 0; i < Math.log(n) / Math.log(2); i++)  {

            if(a % 2 == 0 && b == a - 1) {
                break;
            } else if(a % 2 == 1 && b == a + 1) {
                break;
            }

            answer++;

            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }


        return answer;
    }
}