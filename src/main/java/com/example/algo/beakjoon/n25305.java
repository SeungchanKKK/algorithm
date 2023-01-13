package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

//커트라인
public class n25305 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rank = sc.nextInt();
        int[] arr = new int[N];
        for (int i =0; i<N; i++){
            int score = sc.nextInt();
            arr[i] = score;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-rank]);
    }
}
