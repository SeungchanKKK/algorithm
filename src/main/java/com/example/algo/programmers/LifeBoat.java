package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;

//구명보트
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList<Integer>peo = new ArrayList<>();
        for (int weight: people){
            peo.add(weight);
        }
        int i=0;
        int e=peo.size()-1;
        while (!peo.isEmpty()){
            if(peo.get(i)+peo.get(e)<=100){
                peo.remove(i);
                peo.remove(e);
                e--;
            }else {
                e--;
            }
        }
        return answer;
    }
}
