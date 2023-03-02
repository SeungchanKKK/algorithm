package com.example.algo.beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class n10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Stack<Character>stack = new Stack<>();
        for(int i=0; i<word.length()/2;i++){
            stack.add(word.charAt(i));
        }
        int mid=0;
        if(word.length()/2==0){
            mid = word.length()/2;
        }else {
            mid = word.length()/2+1;
        }
        for (int i=mid; i<word.length();i++){
            if(word.charAt(i)==stack.peek()){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
