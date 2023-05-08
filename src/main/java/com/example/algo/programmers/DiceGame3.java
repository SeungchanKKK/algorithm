package com.example.algo.programmers;

import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer>diceMap = new HashMap<>();
        diceMap.put(a,1);
        putDice(diceMap,b);
        putDice(diceMap,c);
        putDice(diceMap,d);
        if(diceMap.size()==1){
            return a*1111;
        }
        if (diceMap.size()==2){
            int smaller =0;
            int bigger =0;
            for (Integer diceNum: diceMap.keySet()){
                if(diceMap.get(diceNum)==1){
                    smaller=diceNum;
                }
                if(diceMap.get(diceNum)==3){
                    bigger=diceNum;
                }
                if(diceMap.get(diceNum)==2&&smaller==0){
                    smaller=diceNum;
                }
                if(diceMap.get(diceNum)==2&&diceNum!=smaller) {
                    bigger = diceNum;
                }
            }
            System.out.println(smaller);
            System.out.println(bigger);
            if(diceMap.get(smaller)==1||diceMap.get(bigger)==3){
                return (int) Math.pow((10*bigger+smaller),2);
            }else {
                return (smaller+bigger)*Math.abs(smaller-bigger);
            }
        }
        if(diceMap.size()==3){
            int p =0;
            int q = 0;
            int r =0;
            for (Integer diceNum: diceMap.keySet()){
                if(diceMap.get(diceNum)==2){
                    p=diceNum;
                }
                if(diceMap.get(diceNum)==1&&q==0) {
                    q = diceNum;
                }
                if(diceMap.get(diceNum)==1&&diceNum!=q) {
                    r = diceNum;
                }
            }
            return q*r;
        }
        if (diceMap.size()==4){
            int min =7;
            for (Integer diceNum: diceMap.keySet()){
                if(diceNum<min){
                    min=diceNum;
                }
            }
            return min;
        }
        return answer;
    }

    public void putDice(Map<Integer,Integer> map,int num){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }else {
            map.put(num,1);
        }
    }
}
