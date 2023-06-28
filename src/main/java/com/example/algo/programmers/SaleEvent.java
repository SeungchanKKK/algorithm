package com.example.algo.programmers;

import java.util.HashMap;

public class SaleEvent {
    public int solution(String[] want, int[] number, String[] discount) {
        int totalAmount =0;
        for (int num: number){
            totalAmount+=num;
        }
        HashMap<String,Integer>hashMap = new HashMap<>();
        for (int i=0; i<want.length;i++){
            hashMap.put(want[i],number[i]);
        }
        for (int i=0; i<discount.length-totalAmount; i++){
            for (int j=i; j<=totalAmount; j++){
                if(hashMap.containsKey(discount[j])){
                    int amt = hashMap.get(discount[j])-1;
                    hashMap.put(discount[j],amt);
                    if (amt==0){
                        hashMap.remove(discount[j]);
                    }
                }
                if(hashMap.isEmpty()){
                    return i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SaleEvent saleEvent = new SaleEvent();
        String[] strings ={"banana", "apple", "rice", "pork", "pot"};
        int[] integers={3, 2, 2, 2, 1};
        String[] discount ={"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println( saleEvent.solution(strings,integers,discount));
    }
}
