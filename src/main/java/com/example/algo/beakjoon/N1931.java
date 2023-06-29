package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class N1931 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[][] time = new int[N][2];
        for (int i=0; i<N; i++){
            time[i][0]=sc.nextInt();
            time[i][1]=sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int occupied =0;
        int cnt=0;
        for (int i=0; i<N;i++){
            if (occupied<time[i][0]){
                cnt++;
                occupied=time[i][1];
            }
        }
        System.out.println(cnt);
    }
}
