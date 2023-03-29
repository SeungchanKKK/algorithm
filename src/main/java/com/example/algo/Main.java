package com.example.algo;

import com.example.algo.programmers.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        DesktopCleaningUp roughKeyboard = new DesktopCleaningUp();
        String[] keymap ={"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(roughKeyboard.solution(keymap)));

    }
}
