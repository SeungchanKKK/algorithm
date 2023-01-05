package com.example.algo.beakjoon;

import java.io.*;
import java.util.StringTokenizer;
//A+B-8
public class re4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        for (int i =0; i<N; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B =Integer.parseInt(st.nextToken());

            bw.write("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B)+"\n");
        }
        bw.flush();
    }
}
