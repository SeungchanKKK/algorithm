package com.example.algo.programmers;

import java.util.Scanner;

public class SumOfInt {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for (int i=0; i<my_string.length();i++){
            if(i>=s&&i<overwrite_string.length()+s-1){
                answer+=overwrite_string.charAt(i-s);
            }else {
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}
