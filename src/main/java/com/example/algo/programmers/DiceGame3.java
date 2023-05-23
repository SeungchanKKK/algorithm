package com.example.algo.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class DiceGame3 {
    public int solution(int[] rank, boolean[] attendance) {
        Queue<Integer>rankQue = new LinkedList<>();
        int series =1;
        while (rankQue.size()<3){
            for (int i=0; i<rank.length; i++){
                if(series==rank[i]){
                    if(attendance[i]){
                        rankQue.add(i);
                        break;
                    }
                }
            }
            series++;
        }
        int answer = 0;
        int mul = 10000;
        for (Integer num:rankQue){
            answer+=mul*num;
            mul/=100;
        }
        return answer;
    }
}
