package com.example.algo.beakjoon;
//정수 N개의 합
public class class1 {
    public long sum(int[] a){
        long answer=0;
        for(int i=0; i<a.length; i++){
            answer+=a[i];
        }
        return answer;
    }
}
