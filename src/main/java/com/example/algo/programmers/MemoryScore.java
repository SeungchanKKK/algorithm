package com.example.algo.programmers;

import java.util.Arrays;
//추억점수
public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i=0; i< photo.length; i++){
            answer[i]=0;
            for (int j=0; j<photo[i].length;j++){
                String personInPicture = photo[i][j];
                if(Arrays.asList(name).contains(personInPicture)){
                    answer[i]+=yearning[Arrays.asList(name).indexOf(personInPicture)];
                }
            }
        }
        return answer;
    }
}
