package com.example.algo.beakjoon;

import java.util.Scanner;

public class n11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long B = sc.nextInt();
        long multi =B;
        String a= "";
        while (B<=N){
            B*=multi;
        }
        B/=multi;
        while (true){
            long cal =N/B;
            if (cal<10){
                a+=cal;
            }else {
                char letter= (char) (cal+55);
                a+=letter;
            }
            N%=B;
            B/=multi;
            if (N==0&&B==0){
                break;
            }
        }
        System.out.println(a);
    }
}
