package com.example.algo.beakjoon;

import java.util.Scanner;

public class N19532 {
    static Scanner sc = new Scanner(System.in);
    static int N, M;
    static char cha;
    static int ans;
    static String[] arr;

    static void intput() {
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
    }

    static void check() {
        for (int i = 0; i < N; i++) {
            String line = arr[i];
            cha = arr[i].charAt(0);
            for (int j = 0; j < M; j++) {
                char curCha = line.charAt(j);
                if (curCha!=cha){
                    ans++;
                }
                if (cha == 'B') {
                    cha = 'W';
                } else {
                    cha = 'B';
                }
            }
        }
    }

    public static void main(String[] args) {
        intput();
        check();
        if (ans>=N*M/2){
            ans=M*N-ans;
        }
        System.out.println(ans);
    }
}
