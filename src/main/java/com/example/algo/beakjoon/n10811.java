package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class n10811 {
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
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer>range= new ArrayList<>();
            for (int j=a-1; j<=b-1;j++){
                range.add(arr[j]);
            }
            int idx=0;
            for (int j=b-1; j>=a-1;j--){
                arr[j]= range.get(idx);
                idx++;
            }
        }
        for (int i=0; i<arr.length;i++){
            stringBuilder.append(arr[i]+" ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));
    }
}
