package com.example.algo.beakjoon;

import java.util.Scanner;
// 다이얼
public class string8 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String in = sc.nextLine();
        int answer= 0;
        for(int i=0; i<in.length(); i++){
            answer+=num(in.charAt(i));
        }
        System.out.println(answer);
    }

    public static int num(char cha){
        if(cha=='A'||cha=='B'||cha=='C'){
            return 3;
        } else if (cha=='D'||cha=='E'||cha=='F') {
            return 4;
        }else if (cha=='G'||cha=='H'||cha=='I') {
            return 5;
        }else if (cha=='J'||cha=='K'||cha=='L') {
            return 6;
        }else if (cha=='M'||cha=='N'||cha=='O') {
            return 7;
        }else if (cha=='P'||cha=='Q'||cha=='R'||cha=='S') {
            return 8;
        }else if (cha=='T'||cha=='U'||cha=='V') {
            return 9;
        }else if (cha=='W'||cha=='X'||cha=='Y'||cha=='Z') {
            return 10;
        }else {
            return 2;
        }
    }
}
