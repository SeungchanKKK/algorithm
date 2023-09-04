package com.example.algo.beakjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class n3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>queueX = new LinkedList<>();
        LinkedList<Integer>queueY = new LinkedList<>();
        for (int i=0; i<3; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (queueX.contains(x)){
                queueX.remove(Integer.valueOf(x));
            }else {
                queueX.add(x);
            }
            if (queueY.contains(y)){
                queueY.remove(Integer.valueOf(y));
            }else {
                queueY.add(y);
            }
        }
        System.out.println(queueX.peek()+" "+queueY.peek());
    }
}
