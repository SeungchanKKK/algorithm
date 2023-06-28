package com.example.algo.beakjoon;

import java.util.Scanner;

public class N9663 {
    static Scanner sc = new Scanner(System.in);
    static int cnt =0;
    static int row =1;
    static int col =1;
    static int N;
    static int[] position;
    static  boolean isAvailable(int[]position,int col,int row){
        for (int i=1; i<= row; i++){
            if (position[i]==col){
                return false;
            }
        }
        return true;
    }
    static void reFun(int k){
        if (k==N){
            cnt++;
        }else {
            for (int i=1;i<=N;i++){
                if(isAvailable(position,i,k)){
                    position[k]=i;
                    reFun(k+1);
                    cnt++;
                }
                position[k]=0;
            }
        }
    }
    public static void main(String[] args) {
        N = sc.nextInt();
        position= new int[N+1];
        reFun(1);
        System.out.println(cnt);
    }
}
