package com.example.algo;

import com.example.algo.programmers.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        SelectingTangerine roughKeyboard = new SelectingTangerine();
        int[] keymap ={1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(roughKeyboard.solution(6,keymap));

    }
}
