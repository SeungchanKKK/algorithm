package com.example.algo.programmers;

import java.util.Arrays;
//N개의 최소공배수
public class NLeastCMul {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        int answer = max;
        while (true){
            boolean check =true;
            for (int i=0; i<arr.length; i++){
                if(answer%arr[i]!=0){
                    check=false;
                    break;
                }
            }
            if(check){
                break;
            }else {
                answer++;
            }
        }
        return answer;
    }
}
