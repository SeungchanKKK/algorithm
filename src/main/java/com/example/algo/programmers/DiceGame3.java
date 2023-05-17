package com.example.algo.programmers;

public class DiceGame3 {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i=0; i<myString.length()-pat.length();i++){
            String part = myString.substring(i,i+pat.length());
            if (part.equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}
