package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
//균형잡힌세상
public class N4949 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String>answers = new ArrayList<>();
        while (true){
            Stack<Character>characters = new Stack<>();
            String line = sc.nextLine();
            String check = "yes";
            if (line.equals(".")){
                break;
            }
            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                if (letter == '(' || letter == '[') {
                    characters.add(letter);
                } else {
                    if (letter == ']' ) {
                        if (!characters.empty()) {
                            if (characters.peek() == '[') {
                                characters.pop();
                            } else {
                                check = "no";
                            }
                        }else {
                            check = "no";
                        }
                    }
                    if (letter == ')') {
                        if (!characters.empty()) {
                            if (characters.peek() == '(') {
                                characters.pop();
                            } else {
                                check = "no";
                            }
                        } else {
                            check = "no";
                        }
                    }
                }
            }
            if (!characters.empty()){
                check="no";
            }
            answers.add(check);
        }
        for (String check:answers){
            System.out.println(check);
        }
    }
}
