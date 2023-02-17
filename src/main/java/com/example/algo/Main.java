package com.example.algo;

import com.example.algo.programmers.MatrixMultiplication;
import com.example.algo.programmers.RotatingParentheses;

public class Main {
    public static void main(String[] ars) {

        MatrixMultiplication lifeBoat = new MatrixMultiplication();
        int[][]a1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][]a2 = {{3, 3}, {3, 3}};
        System.out.println(lifeBoat.solution(a1,a2));

    }
}
