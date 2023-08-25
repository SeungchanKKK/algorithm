package com.example.algo.beakjoon;

import java.util.Scanner;

public class n2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int N = sc.nextInt();
        int sum =0;
        int mul=1;
        for (int i=word.length()-1; i>=0; i--){
            sum+=calculator(word.charAt(i),mul);
            mul*=N;
        }
        System.out.println(sum);
    }

    public static int calculator(char s, int mul){
        if (64<s&&s<91){
            return (s-55)*mul;
        }else {
            return Integer.parseInt(String.valueOf(s))*mul;
        }
    }
}
