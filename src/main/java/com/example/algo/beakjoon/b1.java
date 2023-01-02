package com.example.algo.beakjoon;

import java.util.Scanner;

public class b1
{
    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] array = new int[A];

        int count = 0;

        for(int i=0; i<A;i++){
           array[i]= sc.nextInt();
        }

        int B = sc.nextInt();

        for(int i =0; i< array.length; i++){
            if(array[i]==B){
                count++;
            }
        }
        System.out.println(count);
    }
}