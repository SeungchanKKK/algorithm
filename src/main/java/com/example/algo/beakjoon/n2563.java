package com.example.algo.beakjoon;

import java.util.Scanner;
//색종이
public class n2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer =0;
        int[][] pap = new int[100][100];
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j=x; j<x+10; j++){
                for (int k=y; k<y+10; k++){
                    pap[j][k]=1;
                }
            }
                }
        for (int i=0; i< pap.length;i++){
            for (int j=0; j< pap.length;j++){
                if(pap[i][j]==1){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
