package com.example.algo.programmers;

import java.util.ArrayList;

public class DiceGame3 {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer>numList = new ArrayList<>();
        for (int num:arr){
            boolean check= true;
            for (int delete:delete_list){
                if(num==delete){
                    check=false;
                }
            }
            if(check){
                numList.add(num);
            }
        }
        int[] answer = new int[numList.size()];
        for (int i=0; i< answer.length; i++){
            answer[i]= numList.get(i);
        }
        return answer;
    }
}
