package com.example.algo.programmers;

import java.util.ArrayList;

public class DiceGame3 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer>numList = new ArrayList<>();
        for (String str:intStrs){
            String amount=str.substring(s,l);
            System.out.println(amount);
            if (Integer.parseInt(amount)>k){
                numList.add(Integer.parseInt(amount));
            }
        }
        int[] answer = new int[numList.size()];
        for (int i=0; i<answer.length; i++){
            answer[i]=numList.get(i);
        }
        return answer;
    }
}
