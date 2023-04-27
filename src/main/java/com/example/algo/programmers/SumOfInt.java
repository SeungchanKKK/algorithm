package com.example.algo.programmers;

public class SumOfInt {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode =0;
        for (int i=0; i<code.length(); i++){
            if(mode==0){
                if(code.charAt(i)=='1'){
                    mode=1;
                }
                if(i%2==0&&code.charAt(i)!='1'){
                    answer.append(code.charAt(i));
                }
            }else {
                if(code.charAt(i)=='1'){
                    mode=0;
                }
                if(i%2==1&&code.charAt(i)!='1'){
                    answer.append(code.charAt(i));
                }
            }
        }
        if (answer.length()==0){
            return "EMPTY";
        }
        return answer.toString();
    }
}
