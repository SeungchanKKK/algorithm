package com.example.algo.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class CardDecks {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String>first = new LinkedList<>();
        Queue<String>second = new LinkedList<>();
        for(String one :cards1){
            first.add(one);
        }
        for(String two :cards2){
            second.add(two);
        }
        for (String word:goal){
            if(word.equals(first.peek())){
                first.poll();
            } else if (word.equals(second.peek())) {
                second.poll();
            }else {
                return "No";
            }
        }
        return "Yes";
    }
}
