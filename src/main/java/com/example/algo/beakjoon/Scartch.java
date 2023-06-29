package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Collections;

public class Scartch {
    public int solution(int[] A) {
        int sum =0;
        int left =0;
        ArrayList<Integer>list = new ArrayList<>();
        for (int a:A){
            sum+=a;
        }
        for (int i=0; i<A.length-1;i++){
            left+=A[i];
            int result=Math.abs(sum-2*left);
           list.add(result);
        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        int[]A = {3,1,2,4,3};
        Scartch scartch = new Scartch();
        scartch.solution(A);
    }
}
