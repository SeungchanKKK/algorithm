package com.example.algo.programmers;

public class SumOfInt {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a==b){
            if(a==c){
                return (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
            }else {
                return (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
            }
        }else {
            if(b==c||a==c){
                return (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
            }else {
                return a+b+c;
            }
        }
    }
}
