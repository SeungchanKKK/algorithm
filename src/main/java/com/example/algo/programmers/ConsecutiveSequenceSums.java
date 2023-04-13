package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.HashMap;

//연속 부분 수열 합의 개수
public class ConsecutiveSequenceSums {
    public int solution(int[] elements) {
        int answer=0;
        HashMap<Integer,Boolean> sums = new HashMap<>();
        for (int i=0; i<elements.length; i++){
            answer+=getSum(i,elements,sums);
        }
        return answer;
    }

    public int getSum(int reps, int[] arr, HashMap<Integer,Boolean>sums) {
        int cnt =0;
        for (int i = 0; i <= arr.length; i++) {
            int sum =0;
            for (int j = 0; j <= reps; j++) {
            sum+= arr[(i+j)%arr.length];
            }
            if (!sums.containsKey(sum)){
                sums.put(sum,true);
                cnt++;
            }
        }
        return cnt;
    }
}
