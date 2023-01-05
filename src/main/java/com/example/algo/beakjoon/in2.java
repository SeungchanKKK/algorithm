package com.example.algo.beakjoon;

import java.io.*;
import java.util.StringTokenizer;
//킹, 퀸, 룩, 비숍, 나이트, 폰
public class in2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] chess ={1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<6;i++){
            int a = Integer.parseInt(st.nextToken());
            builder.append(chess[i]-a+ " ");
        }
        builder.delete(builder.length()-1,builder.length());
        bw.write(String.valueOf(builder));
        bw.flush();
    }
}
