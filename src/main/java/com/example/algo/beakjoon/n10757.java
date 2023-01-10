package com.example.algo.beakjoon;

import java.math.BigInteger;
import java.util.Scanner;

// 큰 수 A+B
public class n10757 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        System.out.println(a.add(b));
    }
}
