package com.example.algo.programmers;

public class LongJump {
    public long solution(int n) {
        long []cache =new long[n+1];
        cache[0]=1;
        cache[1]=2;
        for (int i=2; i<n;i++){
            cache[i]=(cache[i-1]+cache[i-2])%1234567;
        }
        return cache[n-1];
        
    }
}
