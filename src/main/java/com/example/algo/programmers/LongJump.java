package com.example.algo.programmers;

public class LongJump {
    public long solution(int n) {
        long []cache =new long[n+1];
        cache[1]=1;
        cache[2]=2;
       for (int i=3; i<=n;i++){
          cache[i]=cache[i-1]+cache[i-2];
       }
       return cache[n-1]%1234567;
    }
}
