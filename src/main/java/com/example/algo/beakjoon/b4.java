package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>array = new ArrayList<>();

        for(int i=0; i<9;i++){
            array.add(sc.nextInt());
        }

        int mm = array.stream().max().get();
        int idx = array.indexOf(mm);

        System.out.println(Arrays.stream(array).max().getAsInt());
    }
}
