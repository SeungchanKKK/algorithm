package com.example.algo.beakjoon;

import java.util.Scanner;
// 평균은 넘겠지
public class b9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int student = sc.nextInt();
            int[] scores= new int[student];
            double sum = 0;
            for (int j=0; j<student;j++){
                scores[j]=sc.nextInt();
                sum+=scores[j];
            }
            double ave=sum/(double) student;
            int pass =0;
            for(int j=0;j< scores.length;j++){
                if(scores[j]>ave){
                    pass++;
                }
            }
            double overpass= (double) pass/(double) student;
            System.out.printf("%.3f",overpass*100);
            System.out.println("%");
        }
    }
}
