package com.example.algo.programmers;

import java.util.ArrayList;

public class IntegerTriangle {
    ArrayList<Integer>sum = new ArrayList<>();
    ArrayList<Integer>[]sums;
    int max =0;
    public int solution(int[][] triangle) {
        int answer = 0;
        sums = new ArrayList[triangle.length];
        return answer;
    }

    public void DFS(int d,int[][] triangle){
        if (d==triangle.length){
            if (sums[d])
        }else {
            for (int i=0; i<triangle[d].length; i++){
                for (int j=0; j<2; j++){
                    if (j==0){
                        int num = sums[d].get(i);
                        sums[d+1].add(num+triangle[d+1][i]);
                        DFS(d+1,triangle);
                    }else {
                        int num = sums[d].get(i);
                        sums[d+1].add(num+triangle[d+1][i+1]);
                    }
                }
                DFS(d+1,triangle);
            }
        }
    }
}
