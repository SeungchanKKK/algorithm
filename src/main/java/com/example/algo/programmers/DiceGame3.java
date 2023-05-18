package com.example.algo.programmers;

import java.util.ArrayDeque;
import java.util.Deque;

public class DiceGame3 {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> numStack= new ArrayDeque<>();
        for (int i=0; i<arr.length; i++){
            if (flag[i]){
                for (int j=0; j<arr[i]*2;j++){
                    numStack.push(arr[i]);
                }
            }else {
                for (int j=0; j<arr[i];j++){
                    numStack.pop();
                }
            }
        }
        int[] answer = new int[numStack.size()];
        for (int i=0; i<answer.length; i++){
            answer[i]=numStack.pollFirst();
        }
        return answer;
    }
}
