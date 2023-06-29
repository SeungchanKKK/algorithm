package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class N11047 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int answer=0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer>list = new ArrayList<>();
        for (int i=0; i<N;i++){
            int num= sc.nextInt();
            list.add(num);
        }
        int i=list.size()-1;
        while (K!=0){
            if (list.get(i)<=K){
                K-=list.get(i);
                answer++;
            }else {
                i--;
            }
        }
        System.out.println(answer);
    }
}
