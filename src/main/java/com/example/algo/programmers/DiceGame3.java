package com.example.algo.programmers;

public class DiceGame3 {
    public int solution(int[] date1, int[] date2) {
        int answer = 1;
        for (int i=0; i<date1.length; i++){
            if (date1[i] > date2[i]) {
                answer = 0;
                break;
            }
            if(date1[i] < date2[i]){
                answer=1;
                break;
            }
            if (date1[2]==date2[2]){
                return 0;
            }
        }
        return answer;
    }
}
