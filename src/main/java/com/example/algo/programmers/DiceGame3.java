package com.example.algo.programmers;

import java.util.ArrayList;

public class DiceGame3 {
    public String[] solution(String myStr) {
        ArrayList<String>stringArrayList = new ArrayList<>();
        StringBuilder part = new StringBuilder();
        for (int i=0; i<myStr.length(); i++){
            String letter = String.valueOf(myStr.charAt(i));
            if (letter.equals("a")||letter.equals("b")||letter.equals("c")){
                if(part.length()!=0){
                    stringArrayList.add(part.toString());
                }
                part = new StringBuilder();
            }else {
                part.append(letter);
            }
        }
        if(part.length()!=0){
            stringArrayList.add(part.toString());
        }
        if(stringArrayList.size()==0){
            stringArrayList.add("EMPTY");
        }
        return stringArrayList.toArray(new String[0]);
    }
}
