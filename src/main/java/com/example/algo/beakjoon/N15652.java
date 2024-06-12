package com.example.algo.beakjoon;

import java.util.Scanner;

public class N15652 {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();

    static int M  = sc.nextInt();

    static int[]arr = new int[M];

    static int min = 0;

    static void dfs(int k){
        if (k==M){
            for (int i=0; i<arr.length; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
        }else {
            for (int i=1; i<=N; i++){
                if (i>=min){
                    min= i;
                    arr[k]= i;
                    dfs(k+1);
                    min =0;
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
        System.out.println(sb.toString());
    }
}
