package com.example.algo;

import com.example.algo.programmers.DiceGame3;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        DiceGame3 roughKeyboard = new DiceGame3();
        int[] arr = {0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(roughKeyboard.solution(arr)));

    }
}
