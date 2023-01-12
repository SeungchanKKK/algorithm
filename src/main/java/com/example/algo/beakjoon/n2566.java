package com.example.algo.beakjoon;

import java.util.Scanner;
//최댓값
public class n2566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int raw = 0;
        int colum=0;
        int max =-1;
        for(int i=0; i<81; i++){
            int in=sc.nextInt();
            if(in>max){
                max=in;
                raw=i%9+1;
                colum=i/9+1;
            }
        }
        System.out.println(max);
        System.out.println(colum+" "+raw);
    }
}
