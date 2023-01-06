package com.example.algo.beakjoon;

import java.util.Arrays;
        import java.util.Scanner;

//아스키코드
public class string1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        System.out.println(Arrays.toString(letter.getBytes()).replace("]","").replace("[",""));
    }
}
