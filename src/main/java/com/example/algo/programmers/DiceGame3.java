package com.example.algo.programmers;

public class DiceGame3 {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i=0; i<str_list.length; i++){
            if (str_list[i].equals("l")){
                answer=new String[i];
                for (int j=0; j<answer.length; j++){
                    answer[j]= str_list[j];
                }
                break;
            }
            if (str_list[i].equals("r")){
                answer=new String[str_list.length-i-1];
                int idx=0;
                for (int j=i+1; j<=answer.length; j++){
                    answer[idx]= str_list[j];
                    idx++;
                }
                break;
            }
        }
        return answer;
    }
}
