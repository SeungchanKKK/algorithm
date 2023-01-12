package com.example.algo.beakjoon;

import java.util.Scanner;

//행렬 덧셈
public class n2738 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] a = new int[N][M];
        int[][] b = new int[N][M];
        int[][] c = new int[N][M];
        for (int i =0; i<N; i++){
            for (int j=0; j<M; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<N; i++){
            for (int j=0; j<M; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<N; i++){
            StringBuilder result = new StringBuilder();
            for (int j=0; j<M; j++){
                c[i][j] = a[i][j]+b[i][j];
                result.append(c[i][j]);
                result.append(" ");
            }
            result.delete(result.length()-1,result.length());
            System.out.println(result);
        }
    }
}
