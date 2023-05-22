package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceGame3 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
            } else {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                } else {
                    stk.add(arr[i]);
                }
            }
        }
        int[]answer = {};
        if (stk.size()==0){
            answer=new int[1];
            answer[0]=1;
        }else {
            answer = new int[stk.size()];
            for (int i=0; i<answer.length;i++){
                answer[i]=stk.get(i);
            }
        }
        return answer;
    }
}
