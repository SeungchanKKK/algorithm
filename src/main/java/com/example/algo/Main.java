package com.example.algo;

import com.example.algo.programmers.MatrixMultiplication;
import com.example.algo.programmers.RotatingParentheses;
import com.example.algo.programmers.RoughKeyboard;
import com.example.algo.programmers.WalkInPark;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        WalkInPark roughKeyboard = new WalkInPark();
        String[] keymap ={"SOO","OXX","OOO"};
        String[] targets={"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(roughKeyboard.solution(keymap, targets)));

    }
}
