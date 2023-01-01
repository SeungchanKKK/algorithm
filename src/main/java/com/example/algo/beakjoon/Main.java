package com.example.algo.beakjoon;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String[] nums= String.valueOf(B).split(" ");

        int count = 0;

        for(int i=0; i<A;i++){
            if(Integer.parseInt(nums[i])==C){
                count++;
            }
        }

        System.out.println(count);
    }
}