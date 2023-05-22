package com.example.algo.programmers;

public class DiceGame3 {
    public int[] solution(int[] arr) {
        int size =1;
        while (size<arr.length){
            size*=2;
        }
        size*=2;
        int[] answer = new int[size];
        for (int i=0; i<answer.length; i++){
            if(i+1>arr.length){
                answer[i]=0;
            }else {
                answer[i]=arr[i];
            }
        }
        return answer;
    }
}
