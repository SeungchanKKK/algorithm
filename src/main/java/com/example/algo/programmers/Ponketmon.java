package com.example.algo.programmers;

import java.util.ArrayList;

public class Ponketmon {
    public int solution(int[] nums) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int num: nums){
            if (!arrayList.contains(num)){
                arrayList.add(num);
            }
        }
        if (nums.length/2>arrayList.size()){
            return arrayList.size();
        }else {
            return nums.length/2;
        }
    }
}
