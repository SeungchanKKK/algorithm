package com.example.algo.beakjoon;

import java.util.Scanner;

//상수
public class string7 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String in = sc.nextLine();
        StringBuffer sb = new StringBuffer(in);
        String reverse = sb.reverse().toString();

        int A = Integer.parseInt(reverse.split(" ")[0]);
        int B = Integer.parseInt(reverse.split(" ")[1]);

        if(A>B){
            System.out.println(A);
        }else {
            System.out.println(B);
        }
    }
}
