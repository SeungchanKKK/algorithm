package com.example.algo.beakjoon;

import java.util.Scanner;

public class N1182 {
    static Scanner sc = new Scanner(System.in);
    static int cnt = 0;
    static int S;
    static int N;
    static int[] arr;

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) cnt++;
            return;
        }
        //tree를 생각해서 직접 그려보면 이해하기가 쉽습니다.
        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
    public static void main(String[] args) {
        N = sc.nextInt();
        S = sc.nextInt();
        arr= new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        dfs(0,0);
        if (S == 0) System.out.println(cnt - 1);
            //S 0일때가 전체 합이 0 일때랑 겹치기 때문에 -1 을 해주어야 합니다.
            //위의 사진에 공집합이 0이라고 볼 수 있습니다
        else System.out.println(cnt);
    }
}
