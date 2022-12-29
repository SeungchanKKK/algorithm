package com.example.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        Solution s = new Solution();
        String[] v= {"muzi", "frodo", "apeach", "neo"};
        String[] x={"ryan con", "ryan con", "ryan con", "ryan con"};
        int[] answer =s.solution(v,x,2);
        System.out.println(answer);
    }
}
