package com.example.algo.programmers;

import java.util.ArrayList;

public class SumOfInt {
    public int[] solution(int n) {
        ArrayList<Integer>array = new ArrayList<>();
        array.add(n);
        while (n!=1){
            if(n%2==0){
                n/=2;
            }else {
                n=n*3+1;
            }
            array.add(n);
        }
        int[] answer = new int[array.size()];
        for (int i=0; i<answer.length; i++){
            answer[i]=array.get(i);
        }
        return answer;
    }
}
