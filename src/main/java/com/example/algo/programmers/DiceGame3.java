package com.example.algo.programmers;

public class DiceGame3 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i=c-1; i<my_string.length()-1;i+=m){
            answer+=my_string.charAt(i);
        }
        return answer;
    }
}
