package com.example.algo.programmers;

public class Fatigue {
    public static void main(String[] args) {
        Fatigue fatigue = new Fatigue();
        fatigue.solution(80,	new int[][]{{50, 40}, {80, 20}, {30, 10}});
    }
    static boolean[] check;
    static int cnt =0;
    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        DFS(0,k,dungeons);
        return cnt;
    }

    void DFS(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            //조건체크
            if (k >= dungeons[i][0]&&!check[i] ) {
                check[i] = true;
                DFS(depth + 1, k - dungeons[i][1], dungeons);
                check[i] = false;
            }
        }
        cnt = compare(cnt,depth);
    }

    public int compare(int max, int input){
        if (max<input){
            return input;
        }
        return max;
    }
}
