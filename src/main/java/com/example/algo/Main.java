package com.example.algo;

import com.example.algo.programmers.DiceGame3;
import com.example.algo.programmers.SpiralArrangement;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {

        SpiralArrangement spiralArrangement = new SpiralArrangement();
        int[][] arr = {{1, 2, 3, 4, 5},{16, 17, 18, 19, 6},{15, 24, 25, 20, 7},{14, 23, 22, 21, 8},{13, 12, 11, 10, 9}};
        System.out.println(Arrays.toString(spiralArrangement.solution(5)));

    }
}
