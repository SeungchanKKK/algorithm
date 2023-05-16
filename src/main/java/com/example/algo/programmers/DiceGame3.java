package com.example.algo.programmers;

public class DiceGame3 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query:queries){
            for (int i=query[0];i<query[1];i++){
                arr[i]++;
            }
        }
        return arr;
    }
}
