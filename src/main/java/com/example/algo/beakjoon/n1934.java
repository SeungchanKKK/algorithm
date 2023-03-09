package com.example.algo.beakjoon;

import java.util.Scanner;
//최소공배수
public class n1934 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rpt = sc.nextInt();
        for (int i=0; i<rpt;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cd = 0;
            if(a<b){
                cd = gcd(b,a);
            }else {
                cd = gcd(a,b);
            }
            System.out.println(a*b/cd);
        }
    }

    static public int gcd(int a, int b) {
        if(a%b==0){
            return b;
        }else {
            return gcd(b,a%b);
        }
    }
}
