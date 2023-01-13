package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

//수 정렬하기
public class n2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr= new int[N];
        for (int i=0; i<N; i++){
            int in=sc.nextInt();
            arr[i]=in;
        }
        Arrays.sort(arr);
        for (int out:arr){
            System.out.println(out);
        }
    }
}
