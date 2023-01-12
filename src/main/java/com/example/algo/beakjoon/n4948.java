package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//베르트랑 공준
public class n4948 {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int M = sc.nextInt();
            if(M==0){
                break;
            }
            int N = 2 * M;
            int cnt = 0;
            for (int i = M+1; i <= N; i++) {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check && i != 1) {
                    cnt++;
                }
            }
            nums.add(cnt);
        }
        for (int num: nums){
            System.out.println(num);
        }
    }
}
