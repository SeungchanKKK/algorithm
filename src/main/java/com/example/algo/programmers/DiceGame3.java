package com.example.algo.programmers;

import java.util.ArrayList;

public class DiceGame3 {
    public int[] solution(int l, int r) {
        String[] nums = {"1","2","3","4","6","7","8","9"};
        ArrayList<Integer>numList = new ArrayList<>();
        for (int i=l;i<=r;i++){
            boolean check = true;
            for (String num:nums){
                if(String.valueOf(i).contains(num)){
                    check=false;
                    break;
                }
            }
            if(check){
                numList.add(i);
            }
        }
        if(numList.isEmpty()){
            int[]answer = new int[1];
            answer[0]=-1
            return answer;
        }else {
            int[]answer = new int[numList.size()];
            for (int j=0; j<answer.length; j++){
                answer[j]=numList.get(j);
            }
            return answer;
        }
    }
}
