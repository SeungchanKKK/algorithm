package com.example.algo.programmers;

import java.util.Arrays;

public class DiceGame3 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int idx =0;
        for (int i=my_string.length()-2; i>0; i--){
            answer[idx]=my_string.substring(i);
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
