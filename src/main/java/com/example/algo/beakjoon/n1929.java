package com.example.algo.beakjoon;

import java.util.Scanner;
//소수구하기
public class n1929 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for (int i=M; i<=N; i++){
            boolean check = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check&&i!=2&&i!=1){
                System.out.println(i);
            }
        }
    }
}
