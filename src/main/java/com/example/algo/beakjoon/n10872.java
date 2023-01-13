package com.example.algo.beakjoon;

import java.util.Scanner;

//팩토리얼
public class n10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==0){
            System.out.println(1);
        }else {
            int answer = pibo(N);
            System.out.println(answer);
        }
    }
    public static int pibo(int N){
        if(N==1){
            return 1;
        }else {
            return N*pibo(N-1);
        }
    }
}
