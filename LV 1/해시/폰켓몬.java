// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> pokemon = new HashSet<>();

        for(int num : nums){
            pokemon.add(num);
        }
        answer = pokemon.size();

        if(pokemon.size() > nums.length / 2){
            answer = nums.length / 2;
        }

        return answer;
    }
}