package com.example.algo.beakjoon;

import java.util.Scanner;
//1193 분수찾기
public class math3 {
    public static class divisor{
        int numo =1;
        int deno =1;
        String drt = "up";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        divisor divisor = new divisor();
        for(int i=1; i<N;i++){
            if(divisor.drt.equals("up")){
                if(divisor.numo==1){
                    right(divisor);
                }else {
                    wUp(divisor);
                }
            }else {
                if (divisor.deno == 1) {
                    down(divisor);
                }else {
                    wDown(divisor);
                }
            }
        }
        System.out.println(divisor.numo+"/"+ divisor.deno);
    }
    public static divisor right(divisor divisor){
        divisor.deno++;
        divisor.drt="down";
        return divisor;
    }
    public static divisor down(divisor divisor){
        divisor.numo++;
        divisor.drt="up";
        return divisor;
    }
    public static divisor wDown(divisor divisor){
        divisor.numo++;
        divisor.deno--;
        return divisor;
    }
    public static divisor wUp(divisor divisor){
        divisor.numo--;
        divisor.deno++;
        return divisor;
    }
}
