package com.example.algo.beakjoon;

import java.util.Scanner;
//별찍기-7
public class n2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int repeat = 2 * N - 1;
        for (int i = 1; i <= repeat; i++) {
            for (int j = 1; j <= repeat; j++) {
                int a=0;
                if(i<=N){
                    a=i;
                }else {
                    a=2*N-i;
                }
                if (Math.abs(N - j) < a) {
                    System.out.print("*");
                } else if(N-j>0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
