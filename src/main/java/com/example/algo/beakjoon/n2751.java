package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//수 정렬하기 2
public class n2751 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<N; i++){
            int a = sc.nextInt();
            arrayList.add(a);
        }
        Collections.sort(arrayList);
        for (int out: arrayList){
            sb.append(out).append('\n');
        }
        System.out.println(sb);
    }
}
