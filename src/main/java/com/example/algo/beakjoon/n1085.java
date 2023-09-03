package com.example.algo.beakjoon;

import java.util.Scanner;

public class n1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int gapX = w-x;
        int gapY = h-y;

        int minStart = Math.min(x,y);
        int minEnd = Math.min(gapX,gapY);
        System.out.println(Math.min(minEnd,minStart));
    }
}
