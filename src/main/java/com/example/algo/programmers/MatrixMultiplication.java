package com.example.algo.programmers;

public class MatrixMultiplication {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<answer.length;i++){
            for (int j=0; j<answer[0].length; j++){
                int value =0;
                for(int k=0; k<arr2.length;k++){
                    value+=(arr2[k][j]*arr1[i][k]);
                }
                answer[i][j]=value;
            }
        }
        return answer;
    }
}
