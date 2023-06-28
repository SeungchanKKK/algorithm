package com.example.algo.programmers;

import java.util.HashMap;

public class SaleEvent {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0;
        int totalAmount =0;
        for (int num: number){
            totalAmount+=num;
        }
        HashMap<String,Integer>amtList = new HashMap<>();
        for (int i=0; i<want.length;i++){
            amtList.put(want[i],number[i]);
        }
        for (int i=0; i<=discount.length-totalAmount; i++){
            HashMap<String,Integer>hashMap=new HashMap<>(amtList);
            for (int j=i; j<10+i; j++){
                if(hashMap.containsKey(discount[j])){
                    int amt = hashMap.get(discount[j])-1;
                    hashMap.put(discount[j],amt);
                    if (hashMap.get(discount[j])==0){
                        hashMap.remove(discount[j]);
                    }
                }
                if(hashMap.isEmpty()){
                    answer+=(i+1);
                    System.out.println(answer);
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        SaleEvent saleEvent = new SaleEvent();
        String[] strings ={"banana", "apple", "rice", "pork", "pot"};
        int[] integers={3, 2, 2, 2, 1};
        String[] discount ={"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println( saleEvent.solution(strings,integers,discount));
    }
}
