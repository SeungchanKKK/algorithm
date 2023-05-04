package com.example.algo.programmers;

public class SumOfInt {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for (int[] querie:queries){
            answer= switching(answer,querie[0],querie[1]);
        }
        return answer;
    }

    public String switching(String word,int a,int b){
        String part = word.substring(a,b+1);
        StringBuilder front = new StringBuilder(word.substring(0, a));
        String behind = word.substring(b+1);
        for (int i=part.length()-1;i>=0;i--){
            front.append(part.charAt(i));
        }
        front.append(behind);
        return String.valueOf(front);
    }
}
