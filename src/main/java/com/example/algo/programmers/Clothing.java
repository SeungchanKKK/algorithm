package com.example.algo.programmers;

import java.util.HashMap;
import java.util.Set;

public class Clothing {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer>hashMap = new HashMap<>();
        for (String[] cloth: clothes){
            hashMap.put(cloth[1],hashMap.getOrDefault(cloth[1],0)+1);
        }
        Set<String>stringSet = hashMap.keySet();

        for (String string: stringSet){
            answer*=hashMap.get(string)+1;
        }
        return answer-1;
    }
}
