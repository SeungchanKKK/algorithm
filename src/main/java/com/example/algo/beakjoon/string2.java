package com.example.algo.beakjoon;
//숫자의합
import java.util.Scanner;

public class string2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        int answer=0;
        for(int i =0; i<N; i++){
            answer+=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        System.out.println(answer);
    }
}
