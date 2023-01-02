package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] array = new int[A];

        for(int i=0; i<A;i++){
            array[i]= sc.nextInt();
        }

        System.out.println(Arrays.stream(array).min().getAsInt()+" "+Arrays.stream(array).max().getAsInt());
    }
}