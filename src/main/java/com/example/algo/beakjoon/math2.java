package com.example.algo.beakjoon;

import java.util.Scanner;
//벌집
public class math2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();	// 불변 비용
        int answer =1;
        if (A==1){
        }else {
            int mul=1;
            while (A>1){
                A-=mul*6;
                mul++;
            }
            answer=mul;
        }
        System.out.println(answer);
    }
}
