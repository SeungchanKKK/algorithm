package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>array = new ArrayList<>();

        for(int i=1; i<31;i++){
            array.add(i);
        }
        for(int i=0; i<28;i++){
            array.remove(Integer.valueOf(sc.nextInt()));
        }

        int min = array.get(0);
        int min2 = array.get(1);

        System.out.println(min);
        System.out.println(min2);
    }
}

