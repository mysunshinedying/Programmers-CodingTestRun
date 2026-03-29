// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/155652

class Solution {
    public String solution(String s, String skip, int index) {
        char[] key = s.toCharArray();

        for(int i = 0; i < key.length; i++){
            int count = 0;
            while(count != index){

                key[i]++;

                if(key[i] > 'z') key[i] -= 26;

                if(!skip.contains(Character.toString(key[i]))){
                    count++;
                }
            }

        }

        return new String(key);

    }
}