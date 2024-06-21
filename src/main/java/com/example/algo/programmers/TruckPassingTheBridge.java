package com.example.algo.programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TruckPassingTheBridge {
    public static void main(String[] args) {
        TruckPassingTheBridge truckPassingTheBridge = new TruckPassingTheBridge();
        truckPassingTheBridge.solution(100,100,new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int bridgeWeight = 0;
        int truckidx =0;
        ArrayList<Integer>trucks = new ArrayList<>();
        for (int truck: truck_weights){
            trucks.add(truck);
        }
        Queue<Integer> bridge = new ArrayDeque<>();
        for (int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
        int end=0;
        while (!trucks.isEmpty()||end<truck_weights.length){
            answer++;
            if (bridge.peek()!=0){
                end++;
            }
            bridgeWeight-=bridge.poll();
            if (!trucks.isEmpty()){
                if (weight>=bridgeWeight+trucks.get(truckidx)&&bridge.size()<bridge_length){
                    bridge.add(trucks.get(truckidx));
                    bridgeWeight+=trucks.get(truckidx);
                    trucks.remove(0);
                }else {
                    bridge.add(0);
                }
            }

        }
        return answer;
    }
}
