package com.example.algo.beakjoon;

import java.io.*;

// 빠른 A+B
// https://m.blog.naver.com/ka28/221850826909 참조링크
public class re2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        for (int i =0; i<N; i++){
            int A = Integer.parseInt(bf.readLine());
            int B = Integer.parseInt(bf.readLine());
            bw.write(A+B);
        }

    }
}
