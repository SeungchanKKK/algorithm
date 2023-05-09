package com.example.algo.programmers;

public class DiceGame3 {
    public String solution(String my_string, int s, int e) {
        StringBuilder start = new StringBuilder(my_string.substring(0, s - 1));
        String middle = my_string.substring(s,e);
        String end = my_string.substring(e);
        System.out.println(middle);
        for (int i=middle.length()-1;i>=0;i++){
            start.append(middle.charAt(i));
        }
        start.append(end);
        return String.valueOf(start);
    }
}
