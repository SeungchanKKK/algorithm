package com.example.algo.beakjoon;

import java.util.Scanner;
// 손익분기점
public class Math1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int A = in.nextInt();	// 불변 비용
        int B = in.nextInt();	// 가변 비용
        int C = in.nextInt(); 	// 상품 가격

        if (C <= B) {
            System.out.println("-1");
        }
        else {
            System.out.println((A/(C-B))+1);
        }
    }
}
