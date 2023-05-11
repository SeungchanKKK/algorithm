package com.example.algo.programmers;

public class DiceGame3 {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<my_string.length();i++){
            boolean check = true;
            for (int indice:indices){
                if (i==indice){
                    check= false;
                }
            }
            if (check){
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}
