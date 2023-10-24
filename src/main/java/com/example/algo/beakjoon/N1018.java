package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//체스판 다시 칠하기
public class N1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int min = 2501;
        ArrayList<String>base = new ArrayList<>();
        for (int i=0; i<N; i++){
            base.add(sc.next());
        }
        for (int i=0; i<=N-8; i++){
            for (int j=0; j<=M-8; j++){
                char color = 'B';
                int cnt =0;
                for (int k= i; k<i+8; k++){
                    for (int l = j; l<j+8; l++){
                        char point = base.get(k).charAt(l);
                        if (color==point){
                            cnt++;
                            if (point=='W'){
                                color='B';
                            }else {
                                color='W';
                            }
                        }else {
                            color=point;
                        }
                    }
                    if (color=='W'){
                        color='B';
                    }else {
                        color='W';
                    }
                }
                if (cnt<min){
                    min= cnt;
                }
                color = 'W';
                cnt =0;
                for (int k= i; k<i+8; k++){
                    for (int l = j; l<j+8; l++){
                        char point = base.get(k).charAt(l);
                        if (color==point){
                            cnt++;
                            if (point=='W'){
                                color='B';
                            }else {
                                color='W';
                            }
                        }else {
                            color=point;
                        }
                    }
                    if (color=='W'){
                        color='B';
                    }else {
                        color='W';
                    }
                }
                if (cnt<min){
                    min= cnt;
                }
            }
        }
        System.out.println(min);
    }
}
