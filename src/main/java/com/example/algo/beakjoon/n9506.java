package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//약수들의 합
public class n9506 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            if(num==-1){
                return;
            }
            ArrayList<Integer>arr = new ArrayList<>();
            for (int i=1; i<num;i++){
                if(num%i==0){
                    arr.add(i);
                }
            }
            int  sum =0;
            for (int i:arr){
                sum+=i;
            }
            StringBuilder sb = new StringBuilder();
            if(num==sum){
                sb.append(num);
                sb.append(" = ");
                for (int i:arr){
                    sb.append(i);
                    sb.append(" + ");
                }
                sb.delete(sb.length()-3,sb.length()-1);
            }else {
                sb.append(num).append(" is NOT perfect.");
            }
            System.out.println(sb);
        }
    }
}
