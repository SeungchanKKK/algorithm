package com.example.algo.programmers;

import java.util.ArrayList;

public class Process {
    public static void main(String[] args) {
        Process process = new Process();
        process.solution(new int[]{2, 1, 3, 2},2);
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int priority: priorities){
            arrayList.add(priority);
        }
        while (!arrayList.isEmpty()){
            boolean out = true;
            for (int i=0; i<arrayList.size(); i++){
                if (arrayList.get(0)<arrayList.get(i)){
                    out=false;
                    break;
                }
            }
            if (!out){
                arrayList.add(arrayList.get(0));
                arrayList.remove(0);
                location=locationMove(location,arrayList.size());
            }else {
                answer++;
                if (location==0){
                    return answer;
                }
                arrayList.remove(0);
                location=locationMove(location,arrayList.size());

            }
        }
        return answer;
    }

    int locationMove(int location,int arrLength){
        if (location==0){
            return arrLength-1;
        }else {
            return location-1;
        }
    }
}
