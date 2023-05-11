package com.example.algo.programmers;

public class DiceGame3 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int start = 0;
        int end = 0;
        int gap = 1;
        switch (n) {
            case 1:
                start = 0;
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                end = num_list.length-1;
                break;
            case 3:
                start = slicer[0];
                end = slicer[1];
                break;
            case 4:
                start = slicer[0];
                end = slicer[1];
                gap = slicer[2];
                break;
        }
        return arrayset(start,end,gap,num_list);
    }

    public int[] arrayset(int start,int end, int gap,int[]num_list){
        int[]result = new int[(end-start)/gap+1];
        int idx=0;
        for (int i=0; i<num_list.length; i+=gap){
            result[idx]=num_list[i];
            idx++;
        }
        return result;
    }
}
