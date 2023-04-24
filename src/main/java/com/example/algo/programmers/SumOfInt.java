package com.example.algo.programmers;

public class SumOfInt {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int factor = k;
        for (int i=0;i<n/k;i++){
            answer[i]=k;
            k+=k;
        }
        return answer;
    }
}
