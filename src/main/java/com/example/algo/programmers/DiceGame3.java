package com.example.algo.programmers;

public class DiceGame3 {
    public int[] solution(int[] arr) {
        int startIndex = -1;
        int endIndex = -1;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==2){
                startIndex=i;
                break;
            }
        }
        for (int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                endIndex=i;
                break;
            }
        }
        int[] answer = {};
        if (startIndex==-1&&endIndex==-1){
            answer=new int[1];
            answer[0]=-1;
            return answer;
        }else {
            answer=new int[endIndex-startIndex+1];
            int idx=0;
            for (int i = startIndex; i<=endIndex;i++){
                answer[idx]= arr[i];
            }
        }
        return answer;
    }
}
