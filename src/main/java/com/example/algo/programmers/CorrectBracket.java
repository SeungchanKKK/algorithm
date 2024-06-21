package com.example.algo.programmers;

class CorrectBracket {
    boolean solution(String s) {
        String[] arr = s.split("");
        int stack = 0;
        if (arr[0].equals(")")){
            return false;
        }
        for (String bracket: arr){
            if (bracket.equals(")")){
                stack--;
            }else {
                stack++;
            }
            if (stack<0){
                return false;
            }
        }
        if (stack==0){
            return true;
        }else {
            return false;
        }
    }
}
