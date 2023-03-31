package com.example.algo;

import com.example.algo.programmers.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        Tuple roughKeyboard = new Tuple();
        int[] keymap ={1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(Arrays.toString(roughKeyboard.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));

    }
}
