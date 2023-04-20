package com.example.algo.programmers;

public class SumOfInt {
    public int solution(int a, int b) {
        int answer = 0;
        int sum =Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int multiply = a*b*2;
        if (sum>=multiply){
            return sum;
        }else {
            return multiply;
        }
    }
}
