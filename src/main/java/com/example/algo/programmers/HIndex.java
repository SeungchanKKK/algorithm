package com.example.algo.programmers;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt=0;
        for(int i =10; i>0;i--){
            for(int j =0; j<citations.length; j++){
                if(citations[j]>=i){
                    cnt++;
                }
            }
            if (cnt>=i){
                answer=i;
                break;
            }
            cnt=0;
        }
        return answer;
    }
}
