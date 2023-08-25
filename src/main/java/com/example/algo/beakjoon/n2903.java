package com.example.algo.beakjoon;

import java.util.Scanner;

public class n2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mul=2;
        int base =3;
        for (int i=1; i<N; i++){
            base+=mul;
            mul*=2;
        }
        System.out.println(base*base);
    }
}
