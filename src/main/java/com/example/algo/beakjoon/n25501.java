package com.example.algo.beakjoon;

import java.util.Scanner;
//재귀의 귀재
public class n25501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N;i++){
            String input = sc.next();
            int result =palin(input,0,input.length()-1,1);
            if(result>0){
                System.out.println(1+" "+result);
            }else {
                System.out.println(0+" "+(result*-1));
            }
        }
    }
    public static int palin(String input,int l,int r,int k){
        int check=0;
        if(l>=r) {
            check=1;
            return k*check;
        }
        else if(input.charAt(l)!=input.charAt(r)){
            check=-1;
            return k*check;
        }else {
            k++;
            return palin(input,l+1,r-1,k);
        }
    }
}
