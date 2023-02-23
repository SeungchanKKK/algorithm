package com.example.algo.beakjoon;

import java.util.Scanner;

public class n9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++){
            String str = sc.next();
            String ax = "";
            ax+= str.charAt(0);
            ax+= str.charAt(str.length()-1);
            System.out.println(ax);
        }
    }
}
