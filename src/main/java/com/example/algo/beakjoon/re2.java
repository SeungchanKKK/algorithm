package com.example.algo.beakjoon;

import java.io.*;
import java.util.StringTokenizer;

// 빠른 A+B
// https://m.blog.naver.com/ka28/221850826909 참조링크
public class re2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        for (int i =0; i<N; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B =Integer.parseInt(st.nextToken());
            bw.write(A+B+"\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}
