package com.example.algo;

import com.example.algo.programmers.Carpet;
import com.example.algo.programmers.NextBigNumber;
import com.example.algo.programmers.PrivacyContain;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        Carpet carpet = new Carpet();
        int[] answer = carpet.solution(24,24);
        System.out.println(Arrays.toString(answer));
    }
}
