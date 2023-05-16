package com.example.algo.programmers;

public class DiceGame3 {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i=myString.length()-1; i-pat.length()>=0; i--){
            String part = myString.substring(i-pat.length(),i);
            if(part.equals(pat)){
                return myString.substring(0,i);
            }
        }
        return answer;
    }
}
