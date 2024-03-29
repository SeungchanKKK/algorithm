package com.example.algo.programmers;

import java.util.Arrays;

public class MostPresented {
    public int solution(String[] friends, String[] gifts) {
        int presentScore[] = new int[friends.length];
        int present[][] = new int[friends.length][friends.length];
        for (int i=0; i< gifts.length; i++){
            String[]process = gifts[i].split(" ");
            String give = process[0];
            String given = process[1];
            int giveIdx = 0;
            int givenIdx= 0;
            for (int j=0; j< friends.length; j++){
                if (friends[j].equals(give)){
                    presentScore[j]++;
                    giveIdx=j;
                }
                if (friends[j].equals(given)){
                    presentScore[j]--;
                    givenIdx=j;
                }
            }
            present[giveIdx][givenIdx]++;
        }
        int[] answerPresent = new int[friends.length];
        for (int i=0; i< friends.length; i++){
            for (int j=i; j< friends.length; j++){
                if (present[i][j]==present[j][i]){
                    if (presentScore[i]>presentScore[j]){
                        answerPresent[i]++;
                    } else if (presentScore[i]>presentScore[j]) {
                        answerPresent[j]++;
                    }
                }else {
                    if(present[i][j]>present[j][i]){
                        answerPresent[i]++;
                    }else {
                        answerPresent[j]++;
                    }
                }
            }
        }
        int answer=0;
        for (int i=0; i<answerPresent.length; i++){
            if (answer<answerPresent[i]){
                answer=answerPresent[i];
            }
        }
        return answer;
    }
}
