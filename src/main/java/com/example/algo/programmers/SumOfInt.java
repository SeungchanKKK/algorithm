package com.example.algo.programmers;

import java.util.Scanner;

public class SumOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        for (int i=0;i< arr.length;i++){
            if(97<=arr[i]&&arr[i]<=122){
                arr[i]=(char)(arr[i]-32);
            }else {
                arr[i]=(char)(arr[i]+32);
            }
        }
        System.out.println(arr);
    }
}
