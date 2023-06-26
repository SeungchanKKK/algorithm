package com.example.algo.programmers;

public class Camouflage {
    public int solution(int width,int height,int [][] diagonals) {
        int mod = 1000000019;

        int[][] board = new int[width + 1][height + 1];
        for(int i = 0; i < diagonals.length; i++) {
            board[diagonals[i][1]][diagonals[i][0]] = 4;
        }

        board[0][0] = 0;
        for(int i = 0; i < width ; i++) {
            for(int j = 0; j < height ; j++) {
                if(board[i][j] == 0) continue;
                if(board[i - 1][j] > 0) board[i][j] += board[i - 1][j] % mod;
                if(board[i][j - 1] > 0) board[i][j] += board[i][j - 1] % mod;
            }
        }
        return board[width][height] % mod;
    }
}
