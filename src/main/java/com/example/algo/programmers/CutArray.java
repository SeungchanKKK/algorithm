package com.example.algo.programmers;

import java.util.ArrayList;

public class CutArray {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right-left)];
        int idx=0;
        for(long i=left; i<=right; i++){
            answer[idx]= (int) Math.max(i/n+1,i%n+1);
            idx++;
        }
        return answer;
    }
}
