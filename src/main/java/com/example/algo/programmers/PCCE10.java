package com.example.algo.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class PCCE10 {
    class Solution {
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            int[][] answer = {};
            int sat =0;
            int idx = 4;
            if (ext.equals("code")){
                idx =0;
            } else if (ext.equals("date")) {
                idx =1;
            }else if (ext.equals("maximum")) {
                idx =2;
            }else {
                idx =3;
            }
            for (int i=0; i<data.length; i++){
                if (data[i][idx]<val_ext){
                    sat++;
                }
            }
            answer = new int[sat][4];
            int anidx=0;
            for (int i=0; i<data.length; i++){
                if (data[i][idx]<val_ext){
                    answer[anidx]=data[i];
                    anidx++;
                }
            }
            if (sort_by.equals("code")){
                Arrays.sort(answer, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[0]-o2[0];
                    }
                });
            } else if (idx==1) {
                Arrays.sort(answer, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[1]-o2[1];
                    }
                });
            } else if (idx==2) {
                Arrays.sort(answer, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[2]-o2[2];
                    }
                });
            }else {
                Arrays.sort(answer, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[3]-o2[3];
                    }
                });
            }
            return answer;
        }
    }
}
