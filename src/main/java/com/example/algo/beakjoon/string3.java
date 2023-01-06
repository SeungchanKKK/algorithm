package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//알파벳 찾기
public class string3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Character>alphabet = new ArrayList<>();
        for (int i=97; i<123;i++){
            alphabet.add((char)i);
        }
        String a = sc.next();
        ArrayList<Character>words = new ArrayList<>();
        for (int i =0; i<a.length(); i++){
            words.add(a.charAt(i));
        }
        for(int i =0; i<alphabet.size(); i++){
            if(words.contains(alphabet.get(i))){
                System.out.println(a.indexOf(alphabet.get(i)));
            }else {
                System.out.println(-1);
            }
        }
    }
}
