package com.example.algo.programmers;

public class DiceGame3 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i=0; i<my_string.length(); i++){
            int idx =0;
            if(my_string.charAt(i)<91&&64<my_string.charAt(i)){
                idx =my_string.charAt(i)-65;
            }else {
                idx = my_string.charAt(i)-97+26;
            }
            answer[idx]++;
        }
        return answer;
    }
}
