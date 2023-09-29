package com.example.algo.beakjoon;

import java.util.Scanner;

public class n27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        System.out.println(rec(N));
    }

    public static long rec(long N){
        if (N==1){
            return 1;
        }else {
            return N*rec(N-1);
        }
    }
}
