package com.example.algo.beakjoon;

import java.util.Scanner;
//블랙잭
public class n2798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rpt = sc.nextInt();
        int N = sc.nextInt();
        int[]arr = new int[rpt];
        for (int i=0; i<rpt; i++){
            arr[i]=sc.nextInt();
        }
        int lowGap = 100001;
        for (int i=0; i<arr.length-2; i++){
            for (int j=i+1;j<arr.length-1;j++){
                for (int k=j+1; k<arr.length;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    int gap = N-sum;
                    if(gap<=lowGap&&gap>=0){
                        lowGap=gap;
                    }
                }
            }
        }
        System.out.println(N-lowGap);
    }
}
