package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;
//바구니 순서 바꾸기
public class n10812 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()+1];
        int[] change = new int[arr.length];
        for (int i =0; i<arr.length;i++){
            arr[i]=i;
            change[i]=i;
        }
        int reps = sc.nextInt();
        for (int i=0; i<reps;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int idx = a;
            for (int j = c; j<=b;j++){
                change[idx]=arr[j];
                idx++;
            }
            for (int j=a;j<c;j++){
                change[idx]=arr[j];
                idx++;
            }
            for (int j=a;j<=b;j++){
                arr[j]=change[j];
            }
        }
        System.out.println(Arrays.toString(change).replace(",","").replace("[","").replace("]","").replaceFirst("0 ",""));
    }
}
