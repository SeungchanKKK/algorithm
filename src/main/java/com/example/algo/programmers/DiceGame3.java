package com.example.algo.programmers;

public class DiceGame3 {
    public int[][] solution(int[][] arr) {
        int max=Math.max(arr.length,arr[0].length);
        int[][] answer = new int[max][max];
        for (int i=0; i<answer.length; i++){
            for (int j=0; j<answer[i].length; j++){
                if(i>= arr.length||j>= arr[i].length){
                    answer[i][j]=0;
                }else {
                    answer[i][j]=arr[i][j];
                }
            }
        }
        return answer;
    }
}
