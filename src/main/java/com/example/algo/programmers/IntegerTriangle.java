package com.example.algo.programmers;

import java.util.ArrayList;

public class IntegerTriangle {
    public static void main(String[] args) {
        IntegerTriangle integerTriangle = new IntegerTriangle();
        integerTriangle.solution(new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}});
    }
    ArrayList<Integer>sum = new ArrayList<>();
    ArrayList<Integer>[]sums;
    public int solution(int[][] triangle) {
        sums = new ArrayList[triangle.length];
        sums[0]=sum;
        sums[0].add(triangle[0][0]);
        for (int d=1;d<triangle.length;d++){
            sum = new ArrayList<>();
            for (int i=0;i<sums[d-1].size();i++){
                for (int j=0; j<2; j++){
                    int num = sums[d-1].get(i);
                        num+=triangle[d][i+j];
                    sum.add(num);
                }
            }
            sums[d]=sum;
        }
        return 3;
    }
}
