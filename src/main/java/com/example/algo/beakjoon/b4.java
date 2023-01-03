package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>array = new ArrayList<>();

        for(int i=0; i<9;i++){
            array.add(sc.nextInt());
        }

        int mm = Collections.max(array);
        int idx = array.indexOf(mm);

        System.out.println(mm);
        System.out.println(idx);
    }
}
