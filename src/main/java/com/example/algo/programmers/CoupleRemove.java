package com.example.algo.programmers;

import java.util.Stack;

//짝지어 제거하기
public class CoupleRemove {
    public int solution(String s)
    {
        Stack<Character>stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(stack.isEmpty()||stack.peek()!=s.charAt(i)){
                stack.push(s.charAt(i));
            }else {
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return 1;
        }else {
            return 0;
        }
    }
}
