package com.example.algo.beakjoon;

import java.util.Scanner;
//OX퀴즈
public class b8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N;i++) {
            String result = sc.next();
            String[] ox= result.split("");
            int sum= 0;
            int cnt =0;
            for(int j=0; j < ox.length;j++){
                if(ox[j].equals("O")){
                    cnt++;
                    sum+=cnt;
                }else {
                    cnt=0;
                }
            }
            System.out.println(sum);
        }
    }
}
