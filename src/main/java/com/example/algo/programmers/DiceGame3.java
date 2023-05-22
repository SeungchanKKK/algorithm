package com.example.algo.programmers;

public class DiceGame3 {
    public int solution(String[] strArr) {
        int[] idxArr = new int[31];
        for (int i=0; i< strArr.length; i++){
            idxArr[strArr[i].length()]++;
        }
        int max = 0;
        for (int i=0; i<idxArr.length;i++){
            if (idxArr[i]>max){
                max=idxArr[i];
            }
        }
        int answer = max;
        return answer;
    }
}
