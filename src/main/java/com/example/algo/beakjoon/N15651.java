package com.example.algo.beakjoon;

import java.util.Scanner;

//N과 M
public class N15651 {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int M = sc.nextInt();
    static int[]arr = new int[M];
    static int K =1;
    static int depth =N;
    static void DFS(int depth) {
	/*
	 깊이가 최대 깊이일경우
	 더이상 탐색할 자식노드는 없으므로 return해준다.
	*/
        if(depth == M) {
            for (int i=0; i<arr.length; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

	/*
	 깊이를 1씩 증가시키면서 DFS를
	 재귀호출한다.
	*/
        for(int i = 1; i <= N; i++) {
            arr[depth] = i;
            DFS(depth + 1);
        }
    }
    public static void main(String[] args) {
        DFS(0);
        System.out.println(sb.toString());
    }
}
