package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//소수
public class n2581 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer>pNum = new ArrayList<>();
        for (int i =M; i<=N; i++){
            if(i!=1){
                pNum.add(i);
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        pNum.remove(Integer.valueOf(i));
                        break;
                    }
                }
            }
        }
        if(pNum.size()==0){
            System.out.println(-1);
        }else {
            int sum =0;
            int min = Collections.min(pNum);
            for (int i : pNum){
                sum+=i;
            }
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
