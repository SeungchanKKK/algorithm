package com.example.algo.programmers;

public class SumOfInt {
    public int solution(String number) {
        int answer = 0;
        for (int i=0; i<number.length();i++){
            answer+=Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer%9;
    }
}
