package com.example.algo.beakjoon;

import java.util.Scanner;
// 약수 구하기
public class n2501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = sc.nextInt();
        int ct =0;
        for (int i=1; i<=num; i++){
            if(num%i==0){
                ct++;
                if(ct==cnt){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
