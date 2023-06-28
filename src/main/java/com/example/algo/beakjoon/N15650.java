package com.example.algo.beakjoon;

import java.util.Scanner;

public class N15650 {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int M = sc.nextInt();
    static int[]selected = new int[M+1];
    static int[]used = new int[N+1];

    static void reFun(int k){
        if (k==M+1){
            for (int i=1; i<=M;i++){
                sb.append(selected[i]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append('\n');
        }else {
            int start = selected[k-1];
            if (start==0){
                start=1;
            }
            for (int i=start; i<=N; i++){
                if (used[i]!=1){
                    selected[k]=i;
                    used[i]=1;
                    reFun(k+1);
                    selected[k]=0;
                    used[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        reFun(1);
        System.out.println(sb.toString());
    }
}
