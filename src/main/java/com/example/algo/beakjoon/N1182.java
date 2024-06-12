package com.example.algo.beakjoon;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class N1182 {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int S = sc.nextInt();
    static int[] arr = new int[N];
    static int count = 0;
    static int sum =0;

    static boolean[] used = new boolean[N];
    static void DFS(int k){
        if (k==N){
        }else {
            int [] parts = new int[k+1];
            for (int i=0; i<arr.length; i++){
                for (int j=0; j<parts.length; j++){
                    if (!used[i]){
                        parts[j]=arr[i];
                        used[i]=true;
                    }
                }
                for (int part: parts){
                    sum+=part;
                }
                if (S==sum){
                    count++;
                    sum=0;
                }
                DFS(k+1);
                used[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        DFS(0);
    }
}
