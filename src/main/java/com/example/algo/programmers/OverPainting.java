package com.example.algo.programmers;

import java.util.ArrayList;

public class OverPainting {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        ArrayList<Integer> wall = new ArrayList<>();
        for (int i=0; i<n;i++){
            wall.add(1);
        }
        for (int problem:section){
            wall.set(problem-1,0);
        }
        while (wall.contains(0)){
            answer++;
            int startPoint = wall.indexOf(0);
            for (int i=0; i<m;i++){
                if(startPoint>=wall.size()){
                    break;
                }
                wall.set(startPoint,1);
                startPoint++;
            }
        }
        return answer;
    }
}
