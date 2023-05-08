package com.example.algo.programmers;

public class DiceGame3 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx =n-1;
        for (int i=0; i<num_list.length;i++){
            answer[i]=num_list[idx% num_list.length];
            
        }
        return answer;
    }
}
