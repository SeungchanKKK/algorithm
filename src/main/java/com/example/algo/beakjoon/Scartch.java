package com.example.algo.beakjoon;

import java.util.PriorityQueue;

public class Scartch {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>(scoville.length);
        for (int sco: scoville){
            pq.add(sco);
        }
        int loop = pq.size();
        while (pq.peek()<K){
            int small1=pq.poll();
            int small2=pq.poll();
            pq.add(small1+(small2*2));
            answer++;
            if (pq.size()==1){
                return -1;
            }
        }
        return answer;
    }
}
