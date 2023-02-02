package com.example.algo.programmers;

import java.util.ArrayList;

public class PasswordForTwo {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> alpha = new ArrayList<>();
        for(int i=97; i<123;i++){
            alpha.add((char)i);
        }
        for (int i=0;i<skip.length();i++){
            alpha.remove(Character.valueOf(skip.charAt(i)));
        }
        for (int i=0; i<s.length();i++){
            int idx = alpha.indexOf(s.charAt(i))+index;
            if(idx>=(26-skip.length())){
                idx%=(26-skip.length());
            }
            char cha = alpha.get(idx);
            answer+=cha;
        }
        return answer;
    }
}
