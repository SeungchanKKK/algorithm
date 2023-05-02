package com.example.algo.programmers;

import java.util.ArrayList;

public class SumOfInt {
    public int[] solution(int[] arr) {
        ArrayList<Integer>array = new ArrayList<>();
        int i=0;
        while (true){
            if (array.isEmpty()){
                array.add(arr[i]);
                i++;
            }else {
                if(array.get(array.size()-1)<arr[i]){
                    array.add(arr[i]);
                    i++;
                    if(arr.length==i){
                        break;
                    }
                }else {
                    array.remove(array.size()-1);
                }
            }
        }
        int[] stk = new int[array.size()];
        for (int j=0; j<stk.length; j++){
            stk[j]=array.get(j);
        }
        return stk;
    }
}
