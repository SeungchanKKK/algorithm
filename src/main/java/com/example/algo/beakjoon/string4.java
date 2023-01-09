package com.example.algo.beakjoon;

import java.util.Scanner;
//문자열 반복
public class string4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i =0; i<N;i++){
            int len = sc.nextInt();
            String word = sc.next();
            for (int j =0; j<word.length(); j++){
                for (int k=0; k<len;k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
