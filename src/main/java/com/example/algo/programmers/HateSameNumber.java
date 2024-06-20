package com.example.algo.programmers;

import java.util.ArrayList;

public class HateSameNumber {
    public ArrayList<Integer> solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        for (int i=1; i< arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
}
