package com.example.algo.programmers;

import java.util.ArrayList;

//끝말잇기
public class FollowUp {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        ArrayList<String>said = new ArrayList<>();
        said.add(words[0]);
        int cnt =1;
        for (int i=1; i< words.length; i++){
            if(words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)){
                answer[0]=(i+1)%n;
                if(answer[0]==0){
                    answer[0]=n;
                }
                answer[1]=(i+n)/n;
                break;
            } else if (said.contains(words[i])) {
                answer[0]=(i+1)%n;
                if(answer[0]==0){
                    answer[0]=n;
                }
                answer[1]=(i+n)/n;
                break;
            }else {
                said.add(words[i]);
            }
        }
        return answer;
    }
}
