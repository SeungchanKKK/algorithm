package com.example.algo.beakjoon;

import java.util.Scanner;

public class n2720 {
    static int quarter = 25;
    static int dime =10;
    static int nickel =5;
    static int penny = 1;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int amt = scanner.nextInt();
            calculation(amt);
        }
    }

    static void calculation(int amt) {
        StringBuilder stringBuilder = new StringBuilder();
        int cnt;
        if (amt>=quarter){
            cnt = amt/quarter;
            amt%=quarter;
        }
        else {
            cnt =0;
        }
        stringBuilder.append(cnt);
        stringBuilder.append(" ");
        if (amt>=dime){
            cnt = amt/dime;
            amt%=dime;
        }
        else {
            cnt =0;
        }
        stringBuilder.append(cnt);
        stringBuilder.append(" ");
        if (amt>=nickel){
            cnt = amt/nickel;
            amt%=nickel;
        }
        else {
            cnt =0;
        }
        stringBuilder.append(cnt);
        stringBuilder.append(" ");
        if (amt>=penny){
            cnt = amt/penny;
            amt%=penny;
        }
        else {
            cnt =0;
        }
        stringBuilder.append(cnt);
        System.out.println(stringBuilder);
    }
}
