package com.example.algo.beakjoon;

import java.util.Scanner;

public class N9663 {
    static Scanner sc = new Scanner(System.in);
    static int cnt = 0;
    static int N = sc.nextInt();
    static int[] position = new int[N + 1];

    static boolean isAvailable(int row) {
        for (int i = 0; i < row; i++) {
            if (position[i] == position[row]) {
                return false;
            } else if (Math.abs(row - i) == Math.abs(position[row] - position[i])){
                return false;
            }
        }
        return true;
    }

    static void DFS(int row) {
        if (row == N) {
            cnt++;
            return;
        }

        for (int col = 0; col < N; col++) {
            position[row]=col;
            if (isAvailable(row)) {
                DFS(row + 1);
            }
        }
    }

    public static void main(String[] args) {
        DFS(0);
        System.out.println(cnt);
    }
}
