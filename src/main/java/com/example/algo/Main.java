package com.example.algo;

import com.example.algo.programmers.MatrixMultiplication;
import com.example.algo.programmers.RotatingParentheses;
import com.example.algo.programmers.RoughKeyboard;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        RoughKeyboard roughKeyboard = new RoughKeyboard();
        String[] keymap ={"AGZ", "BSSS"};
        String[] targets={"ASA","BGZ"};
        System.out.println(Arrays.toString(roughKeyboard.solution(keymap, targets)));

    }
}
