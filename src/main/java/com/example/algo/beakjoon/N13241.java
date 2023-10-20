package com.example.algo.beakjoon;

import java.util.Scanner;

//최소공배수
public class N13241 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();

        long gcd = getGCD(num1, num2);
        System.out.println((num1 * num2) / gcd);

    }

    public static long getGCD(long num1, long num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
