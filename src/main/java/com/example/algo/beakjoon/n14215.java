package com.example.algo.beakjoon;

import java.util.Scanner;

public class n14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;

        int max = Math.max(Math.max(a,b),c);
        int rest = sum - max;
        if (max>=rest){
            System.out.println(2*rest-1);
        }else {
            System.out.println(sum);
        }
    }
}
