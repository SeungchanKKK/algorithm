package com.example.algo.programmers;

import java.util.HashMap;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer>ranking = new HashMap<>();
        for (int i =0; i<players.length;i++){
            ranking.put(players[i],i);
        }
        for (String name:callings){
            overPass(ranking,players,name);
        }
        return players;
    }
    public void overPass(HashMap<String,Integer>ranking,String[] players, String player){
        int position = ranking.get(player);
        String passed = players[position-1];
        players[position-1] = player;
        players[position] = passed;
        ranking.put(player,position-1);
        ranking.put(passed,position);
    }
}
