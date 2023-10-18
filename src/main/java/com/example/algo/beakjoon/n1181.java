package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//단어정렬

public class n1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<N; i++){
            String str = sc.next();
            arr.add(str);
        }
        List<String> arr2 = arr.stream().distinct().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).collect(Collectors.toList());

        for (int i=0; i<arr2.size(); i++){
            System.out.println(arr2.get(i));
        }

    }
}
