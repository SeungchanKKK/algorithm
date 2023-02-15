package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.Collections;

//구명보트
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer>rest = new ArrayList<>();
        for (int person:people){
            rest.add(person);
        }
        Collections.sort(rest);
        while (rest.size()!=0){
            if(rest.get(0)<=limit/2&&rest.size()>1){
                for (int i =rest.size()-1;i>=0;i--){
                    if((rest.get(0)+rest.get(i))<=limit&&i!=0){
                        answer++;
                        rest.remove(i);
                        rest.remove(0);
                        break;
                    } else if (i==0) {
                        rest.remove(0);
                        answer++;
                    }
                }
            }else {
                rest.remove(0);
                answer++;
            }
        }
        return answer;
    }
}
