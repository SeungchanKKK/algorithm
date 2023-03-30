package com.example.algo.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class FirstCache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String>cache = new LinkedList<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        for (String city:cities){
            String name = city.toLowerCase();
            if(cache.contains(name)){
                cache.remove(name);
                answer++;
                cache.add(name);
            }else {
                answer+=5;
                if(cache.size()>=cacheSize&&cache.size()!=0){
                    cache.remove();
                }
                cache.add(name);
            }
        }
        return answer;
    }
}
