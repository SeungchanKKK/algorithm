package com.example.algo.beakjoon;

import java.util.Scanner;
import java.util.Stack;

//제로
public class n10773 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
        Stack<Integer>nums = new Stack<>();
        int result = 0;
        for (int i=0; i<N; i++){
            int put = sc.nextInt();
            if(put==0){
                nums.pop();
            }else {
                nums.push(put);
            }
        }
        for(int num:nums){
            result+=num;
        }
        System.out.println(result);
    }
}
