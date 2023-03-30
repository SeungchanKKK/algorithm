package com.example.algo.programmers;

import java.util.*;
//귤고르기
public class SelectingTangerine {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer>amount = new HashMap<>();
        for (int size:tangerine){
            if(amount.containsKey(size)){
                amount.put(size,amount.get(size)+1);
            }else {
                amount.put(size,1);
            }
        }
        List<Integer>valueList = new ArrayList<>(amount.values());
        valueList.sort(Comparator.reverseOrder());
        for (Integer value:valueList){
            k-=value;
            answer++;
            if(k<=0){
                break;
            }
        }
        return answer;
    }
}
