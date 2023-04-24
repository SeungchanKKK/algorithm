package com.example.algo.programmers;

import java.util.Arrays;

public class SumOfInt {
    public int[] solution(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int num = arr[i];
            if(num>=50&&num%2==0){
                num/=2;
            } else if (num<50&&num%2==1) {
                num*=2;
            }
            arr[i]=num;
        }
        return arr;
    }
}
