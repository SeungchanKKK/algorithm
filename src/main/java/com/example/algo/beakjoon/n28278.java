package com.example.algo.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n28278 {
    public static void main(String[] args) throws IOException {
        Stack<Integer>stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        for (int i=0; i<N; i++){
            BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(a.readLine());
            switch (num){
                case 1:
                    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                    int value = Integer.parseInt(b.readLine());
                    stack.add(value);
                    break;
                case 2:
                    if (!stack.empty()){
                        System.out.println(stack.pop());
                    }else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if (!stack.empty()){
                        System.out.println(0);
                    }else {
                        System.out.println(1);
                    }
                    break;
                case 5:
                    if (!stack.empty()){
                        System.out.println(stack.peek());
                    }else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
        bf.close();
    }
}
