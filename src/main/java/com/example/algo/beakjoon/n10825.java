package com.example.algo.beakjoon;

import java.util.Scanner;

public class n10825 {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static String[] nameArr = new String[N];
    static int[] korArr = new int[N];
    static int[] engArr = new int[N];
    static int[] mathArr = new int[N];
    static int[] arr = new int[N];
    public static void main(String[] args) {
        for (int i=0; i<N; i++){
            nameArr[i] = sc.next();
            korArr[i] = sc.nextInt();
            engArr[i] = sc.nextInt();
            mathArr[i] = sc.nextInt();
        }
    }
}
