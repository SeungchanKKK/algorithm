package com.example.algo.beakjoon;

import java.io.IOException;
import java.util.Scanner;

//A+B-8
public class re4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=1; i<=N;i++){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
