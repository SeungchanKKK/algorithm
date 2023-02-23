package com.example.algo.beakjoon;

import java.util.Scanner;

public class n25314 {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int N = sc.nextInt()/4;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i<N;i++){
            stringBuilder.append("long ");
        }
        stringBuilder.append("int");
        System.out.println(stringBuilder);
    }
}
