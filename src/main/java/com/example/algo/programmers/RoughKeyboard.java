package com.example.algo.programmers;

public class RoughKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            for (int j = 0; j < target.length(); j++) {
                char letter = target.charAt(j);
                int idx = 101;
                for (String key : keymap) {
                    if(key.indexOf(letter)==-1){
                        if(idx==101){
                            idx=-1;
                        }
                    }else {
                        if(key.indexOf(letter)<idx||idx==-1){
                            idx=key.indexOf(letter)+1;
                        }
                    }
                }
                if(idx==-1){
                    answer[i]=-1;
                    break;
                }
                answer[i]+=idx;
            }
        }
        return answer;
    }
}
