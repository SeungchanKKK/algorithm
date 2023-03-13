package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;
//덩치
public class n7568 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rpt = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[rpt];
        int[] rank = new int[rpt];
        for (int i=0; i<rpt; i++){
            arr[i]=sc.nextLine();
        }
        for (int i=0; i<arr.length; i++){
            rank[i]++;
            for (int j=0; j< arr.length; j++){
                int iWeight=Integer.parseInt(arr[i].split(" ")[0]);
                int jWeight=Integer.parseInt(arr[j].split(" ")[0]);
                int iHeight=Integer.parseInt(arr[i].split(" ")[1]);
                int jHeight=Integer.parseInt(arr[j].split(" ")[1]);
                if(jWeight>=iWeight&&jHeight>iHeight){
                    rank[i]++;
                }else if(jWeight>iWeight&&jHeight>=iHeight){
                    rank[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(rank).replace(",","").replace("[","").replace("]",""));
    }
}
