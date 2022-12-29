package com.example.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        Solution s = new Solution();
        String[] v= {"muzi", "frodo", "apeach", "neo"};
        String[] x={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int[] answer =s.solution(v,x,2);
        System.out.println(Arrays.toString(answer));
    }
}
