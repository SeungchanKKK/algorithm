package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

//대표값2
public class n2587 {
    public static void main(String[] args){
        int[] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        int total=0;
        for (int i=0; i<5; i++){
            int a = sc.nextInt();
            arr[i]=a;
            total+=a;
        }
        Arrays.sort(arr);
        System.out.println(total/5);
        System.out.println(arr[2]);
    }
}
