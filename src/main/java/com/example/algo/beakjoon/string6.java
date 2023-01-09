package com.example.algo.beakjoon;

import java.util.Scanner;

//단어의 개수
public class string6 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String in = sc.nextLine();
        String[] arr = in.split(" ");
        if(arr.length==0){
            System.out.println("0");
        } else if (arr[arr.length-1].equals("")||arr[0].equals("")) {
            System.out.println(arr.length-1);
        }else {
            System.out.println(arr.length);
        }
    }
}
