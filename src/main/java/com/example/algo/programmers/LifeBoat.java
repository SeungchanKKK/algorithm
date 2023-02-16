package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

//구명보트
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer>rest = new ArrayList<>();
        for (int person:people){
            rest.add(person);
        }
        Collections.sort(rest);
//        Deque<Integer>
        while (rest.size()!=0){
            int weight = rest.get(rest.size()-1);
            if(weight+rest.get(0)<=limit&& rest.size()>1){
                rest.remove(0);
            }
            rest.remove(rest.size()-1);
            answer++;
        }
        return answer;
    }
}
