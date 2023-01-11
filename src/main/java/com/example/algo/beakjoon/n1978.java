package com.example.algo.beakjoon;

import java.util.Scanner;

//소수 찾기
public class n1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt =N;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            if(num!=1){
                for(int j =2; j<num; j++){
                    if(num%j==0){
                        cnt--;
                        break;
                    }
                }
            }else {
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}
