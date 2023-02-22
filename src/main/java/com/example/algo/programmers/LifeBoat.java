package com.example.algo.programmers;

import java.util.*;

//구명보트
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList<Integer>rest = new ArrayList<>();
        for (int person:people){
            rest.add(person);
        }
        Deque<Integer>deque = new ArrayDeque<>(rest);
        while (deque.size()!=0){
            int weight = deque.peekLast();
            if(weight+deque.peek()<=limit&& deque.size()>1){
                deque.poll();
            }
            deque.pop();
            answer++;
        }
        return answer;
    }
}
