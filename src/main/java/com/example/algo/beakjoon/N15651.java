package com.example.algo.beakjoon;

import java.util.Scanner;

//N과 M
public class N15651 {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int M = sc.nextInt();
    static int[]selected = new int[M+1];

    static void reFun(int k){
        if (k==M+1){
            for (int i=1; i<=M;i++){
                sb.append(selected[i]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append('\n');
        }else {
            for (int i=1; i<=N; i++){
                selected[k]=i;
                reFun(k+1);
                selected[k]=0;
            }
        }
    }
    public static void main(String[] args) {
        reFun(1);
        System.out.println(sb.toString());
    }
}
