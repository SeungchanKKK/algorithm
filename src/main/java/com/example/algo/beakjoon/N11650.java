package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class N11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>>arr = new ArrayList<>();
        for (int i=0; i<N;i++){
            ArrayList<Integer> cor = new ArrayList<>();
            int x = sc.nextInt();
            int y = sc.nextInt();
            cor.add(x);
            cor.add(y);
            arr.add(cor);
        }
        Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0)==o2.get(0)? o1.get(1)-o2.get(1):o1.get(0)-o2.get(0);
            }
        });
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).get(0) + " " + arr.get(i).get(1));
        }
    }
}
