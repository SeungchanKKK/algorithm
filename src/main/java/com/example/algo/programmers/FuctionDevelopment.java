package com.example.algo.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class FuctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> system = new LinkedList<>();
        for (int progress: progresses){
            system.add(progress);
        }
        while (!system.isEmpty()){
            while (system.poll()<=100){

            }
        }
        return answer;
    }
}
