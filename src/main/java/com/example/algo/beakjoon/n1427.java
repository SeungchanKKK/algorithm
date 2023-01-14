package com.example.algo.beakjoon;

import java.util.Scanner;

public class n1427 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] counting = new int[10];

        int N = in.nextInt();

        while (N != 0) {
            counting[N % 10]++;
            N /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                System.out.print(i);
            }
        }

    }
}
