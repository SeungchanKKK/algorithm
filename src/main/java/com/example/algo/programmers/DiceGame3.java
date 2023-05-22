package com.example.algo.programmers;

import java.util.ArrayList;

public class DiceGame3 {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        ArrayList<Integer>intList = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if(intList.size()>=k){
                break;
            }else {
                if (!intList.contains(arr[i])){
                    intList.add(arr[i]);
                }
            }
        }
        answer= new int[k];
        for (int i=0; i<k; i++){
            if(i+1>intList.size()){
                answer[i]=-1;
            }else {
                answer[i]=intList.get(i);
            }
        }
        return answer;
    }
}
