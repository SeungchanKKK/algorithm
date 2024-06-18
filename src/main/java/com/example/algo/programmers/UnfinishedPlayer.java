package com.example.algo.programmers;

import java.util.HashMap;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String person:participant){
            if (hashMap.containsKey(person)){
                hashMap.put(person,hashMap.get(person)+1);
            }else {
                hashMap.put(person,1);
            }
        }
        for (String complete:completion){
            if (hashMap.get(complete)>1){
                hashMap.put(complete,hashMap.get(complete)-1);
            }else {
                hashMap.remove(complete);
            }
        }
        return hashMap.keySet().toArray()[0].toString();
    }
}
