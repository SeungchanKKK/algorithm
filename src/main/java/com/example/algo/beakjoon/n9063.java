package com.example.algo.beakjoon;

import java.util.Scanner;

public class n9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N==1){
            System.out.println(0);
        }else {
            int xMin = 10001;
            int xMax = -10001;
            int yMin = 10001;
            int yMax = -10001;

            for (int i=0; i<N; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x<xMin){
                    xMin = x;
                }
                if (x>xMax){
                    xMax = x;
                }
                if (y<yMin){
                    yMin = y;
                }
                if (y>yMax){
                    yMax = y;
                }

            }

            System.out.println((xMax-xMin)*(yMax-yMin));
        }
    }
}
