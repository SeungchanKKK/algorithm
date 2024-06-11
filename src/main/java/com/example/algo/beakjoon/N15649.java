package com.example.algo.beakjoon;

import java.util.Scanner;

//N과 M1
public class N15649 {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int M = sc.nextInt();

    static int []arr = new int[M];

    static boolean []used = new boolean[N];

    static void DFS(int k){
        if (k==M){
            for (int i=0; i< arr.length; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=0; i<N; i++){
            if (!used[i]) {
                used[i] = true;
                arr[k]= i+1;
                DFS(k+1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        DFS(0);
        System.out.println(sb.toString());
    }
}
