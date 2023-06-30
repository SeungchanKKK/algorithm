package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Comparator;

public class Scartch {
    public int solution(int[] A, int[] B) {
        int ans=0;
        int[][]arr = new int[A.length][2];
        for (int i=0; i<A.length; i++){
            arr[i][0]=A[i];
            arr[i][1]=A[i];
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int occupied =0;
        for (int i=0; i< arr.length;i++){
            if (occupied<arr[i][0]){
                ans++;
                occupied=arr[i][1];
            }
        }
        System.out.println(ans);
      return ans;
    }
}
