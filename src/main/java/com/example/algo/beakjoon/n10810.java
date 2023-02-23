package com.example.algo.beakjoon;

import java.util.Scanner;

public class n10810 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        int[] arr = new int[N];
        for (int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j=a-1;j<=b-1;j++){
                arr[j]=c;
            }
        }
        for (int i=0; i<arr.length;i++){
            stringBuilder.append(arr[i]+" ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));
    }
}
