package com.example.algo.beakjoon;

import java.util.Scanner;

public class n10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b+c!=180){
            System.out.println("Error");
            System.exit(0);
        }
        if (a==b&&b==c){
            System.out.println("Equilateral");
            System.exit(0);
        }
        if (a==b||b==a||a==c){
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene");
        }
    }
}
