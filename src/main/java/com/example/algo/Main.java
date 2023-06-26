package com.example.algo;

import com.example.algo.programmers.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        Camouflage roughKeyboard = new Camouflage();
        int[][] keymap ={{1,1},{2,2}};
        System.out.println(roughKeyboard.solution(2,2,keymap));

    }
}
