package com.example.algo.beakjoon;

import java.util.Scanner;
//피보나치 수5
public class n10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = pibo(N);
        System.out.println(answer);
    }
    public static int pibo(int N){
        if(N==0){
            return 0;
        } else if (N==1) {
            return 1;
        } else if (N==2) {
            return 1;
        }else {
            return pibo(N-1)+pibo(N-2);
        }
    }
}
