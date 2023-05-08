package com.example.algo.programmers;

import java.util.Arrays;

public class DiceGame3 {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int idx=0;
        for (int num:arr){
            for (int i=0; i<num;i++){
                answer[idx]=num;
                idx++;
            }
        }
        return answer;
    }
}
