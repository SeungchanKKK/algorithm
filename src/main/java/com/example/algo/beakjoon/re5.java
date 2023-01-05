package com.example.algo.beakjoon;

import java.io.IOException;
import java.util.Scanner;

//별찍기2
public class re5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=1; i<=N;i++){
            for (int k =0; k<N-i; k++){
                System.out.print(" ");
            }
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
