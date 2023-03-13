package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//분해합
public class n2231 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fac =N;
        ArrayList<Integer>nums = new ArrayList<>();
        while (fac/10!=0){
            nums.add(fac%10);
            fac/=10;
        }
        nums.add(fac);
        int min = N- (nums.size()*9);
        int result =0;
        for (int i=min;i<N;i++){
            int gen=i;
            int iFac=i;
            while (iFac/10!=0){
                gen+=iFac%10;
                iFac/=10;
            }
            gen+=iFac;
            if(gen==N){
                result=i;
                break;
            }
            result=i;
        }
        System.out.println(result);
    }
}
