package com.example.algo.programmers;

public class SumOfInt {
    public int solution(int a, int b) {
        String front = String.valueOf(a);
        String behind = String.valueOf(b);
        int ab = Integer.parseInt(front+behind);
        int ba = Integer.parseInt(behind+front);
        if(ab>=ba){
            return ab;
        }else {
            return ba;
        }
    }
}
