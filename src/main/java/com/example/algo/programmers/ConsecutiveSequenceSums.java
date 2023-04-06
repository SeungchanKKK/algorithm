package com.example.algo.programmers;

import java.util.ArrayList;
//연속 부분 수열 합의 개수
public class ConsecutiveSequenceSums {
    public int solution(int[] elements) {
        ArrayList<Integer>sums = new ArrayList<>();
        for (int i=0; i<elements.length; i++){
            getSum(i,elements,sums);
        }
        return sums.size();
    }

    public void getSum(int reps, int[] arr, ArrayList<Integer>sums) {
        for (int i = 0; i <= arr.length; i++) {
            int sum =0;
            for (int j = 0; j <= reps; j++) {
            sum+= arr[(i+j)%arr.length];
            }
            if (!sums.contains(sum)){
                sums.add(sum);
            }
        }
    }
}
