package com.example.algo.programmers;

public class RoughKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (String target:targets){
            for (int i=0; i<target.length();i++){
                for (String key:keymap){
                    for (int j=0; j< keymap.length;j++){
                        if(target.charAt(i)=key.charAt(j))
                    }
                }
            }
        }
        return answer;
    }
}
