package com.example.algo.beakjoon;

import java.util.HashSet;
import java.util.Scanner;

//나머지
public class b6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i]= sc.nextInt()%42;
        }
        HashSet<Integer>set= new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        System.out.println(set.size());
    }
}
