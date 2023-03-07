package com.example.algo.beakjoon;

import java.util.Scanner;
//배수와 약수
public class n5086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            int A =sc.nextInt();
            int B = sc.nextInt();
            if(A==0&&B==0){
                return;
            }
            if(A%B==0){
                System.out.println("multiple");
            } else if (B%A==0) {
                System.out.println("factor");
            }else {
                System.out.println("neither");
            }
        }
    }
}
