package com.example.algo.programmers;

import java.util.ArrayList;

public class FuctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer>done = new ArrayList<>();
        ArrayList<Integer>work = new ArrayList<>();
        for (int i=0; i<progresses.length; i++){
            work.add(progresses[i]);
        }
        int add =0;
        while (!work.isEmpty()){
            for (int i=0; i<work.size(); i++){
                work.set(i, work.get(i)+speeds[i+add]);
            }
            if (work.get(0)>=100){
                int finish = 1;
                work.remove(0);
                add++;
                if (work.isEmpty()){
                    done.add(finish);
                    break;
                }
                while (work.get(0)>=100){
                    work.remove(0);
                    finish++;
                    add++;
                    if (work.isEmpty()){
                        break;
                    }
                }
                done.add(finish);
            }
        }
        int[] answer = new int[done.size()];
        for (int i=0; i<answer.length; i++){
            answer[i]=done.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        FuctionDevelopment fuctionDevelopment = new FuctionDevelopment();
        int[]a = {93, 30, 55};
        int[]b = {1, 30, 5};
        fuctionDevelopment.solution(a,b);
    }
}
