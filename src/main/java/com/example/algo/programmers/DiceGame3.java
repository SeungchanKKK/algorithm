package com.example.algo.programmers;

public class DiceGame3 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for (int i=0; i<answer.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            String origin = picture[i/k];
            for (int j=0; j<origin.length(); j++){
                for (int l=0; l<k;l++){
                    stringBuilder.append(origin.charAt(j));
                }
            }
            answer[i]=stringBuilder.toString();
            System.out.println(answer[i]);
        }
        return answer;
    }
}
