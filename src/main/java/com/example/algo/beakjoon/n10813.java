package com.example.algo.beakjoon;

import java.util.Scanner;

public class n10813 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        int[] arr = new int[N];
        for (int i=1; i<=N;i++){
            arr[i-1]=i;
        }
        for (int i=0; i<M; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int temp = arr[a];
            arr[a]= arr[b];
            arr[b]=temp;
        }
        for (int i=0; i<arr.length;i++){
            stringBuilder.append(arr[i]+" ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));
    }
}
