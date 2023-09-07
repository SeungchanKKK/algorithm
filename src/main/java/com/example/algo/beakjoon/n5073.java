package com.example.algo.beakjoon;

import java.util.Scanner;

public class n5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a==0&b==0&&c==0){
                break;
            }
            int sum = a+b+c;
            int max = Math.max(Math.max(a,b),c);
            if (sum-max<=max){
                System.out.println("Invalid");
            }else {
                if (a==b&&b==c){
                    System.out.println("Equilateral");
                } else if (a!=b&&b!=c&&a!=c) {
                    System.out.println("Scalene");
                }else {
                    System.out.println("Isosceles");
                }
            }
        }
    }
}
