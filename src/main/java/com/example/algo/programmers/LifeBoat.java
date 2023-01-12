package com.example.algo.programmers;

import java.util.Arrays;

//구명보트
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 1;
        Arrays.sort(people);
        int space = limit;
        for (int i=0; i<people.length;i++){
            if(space-people[i]>=0){
                space-=people[i];
            }else {
                answer++;
                space=limit-people[i];
            }
        }
        return answer;
    }
}
