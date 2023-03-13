package com.example.algo.beakjoon;

import java.util.Scanner;

public class n10798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[]arr = new String[5];
        int longest = 0;
        for (int i=0; i<5; i++){
            String word = sc.nextLine();
            arr[i]=word;
            if(word.length()>longest){
                longest=word.length();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<longest;i++){
            for (int j=0; j< arr.length; j++){
                if(i<=arr[j].length()-1){
                    stringBuilder.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
