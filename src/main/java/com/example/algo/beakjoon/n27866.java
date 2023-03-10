package com.example.algo.beakjoon;

import java.util.Scanner;
//문자와 문자열
public class n27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int idx = sc.nextInt()-1;
        char alpa = word.charAt(idx);
        System.out.println(alpa);
    }
}
