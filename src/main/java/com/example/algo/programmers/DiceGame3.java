package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceGame3 {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String>strList = new ArrayList<>();
        Arrays.sort(answer);
        for (String str: answer){
            if(str.length()!=0){
                strList.add(str);
            }
        }
        return strList.toArray(new String[0]);
    }
}
