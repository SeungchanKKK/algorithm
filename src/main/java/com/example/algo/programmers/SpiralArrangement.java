package com.example.algo.programmers;

public class SpiralArrangement {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int r = (int) Math.pow(n,2);
        int i=0;
        int j=0;
        int value = 1;
        int min =0;
        while (true){
            while (true){
                answer[i][j]=value;
                if(j>=n-1){
                    break;
                }
                j++;
                value++;
            }
            while (true){
                answer[i][j]=value;
                if(i>=n-1){
                    break;
                }
                i++;
                value++;
            }
            while (true){
                answer[i][j]=value;
                if(j <= min){
                    break;
                }
                j--;
                value++;
            }
            min+=1;
            n-=1;
            while (true){
                answer[i][j]=value;
                if(i <= min){
                    break;
                }
                i--;
                value++;
            }
            if (value>=r){
                break;
            }
        }
        return answer;
    }
}
