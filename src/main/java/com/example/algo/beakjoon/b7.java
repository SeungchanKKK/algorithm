package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

//평균
public class b7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i]=sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        double fSum =0.0;
        for(int i=0; i<N;i++){
            fSum+=(((double) arr[i])/(double) max)* 100L;
        }
        System.out.println(fSum/N);
    }
}
