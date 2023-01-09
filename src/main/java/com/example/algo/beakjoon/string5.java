package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//단어공부
public class string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String arrayed = word.toLowerCase();
        String[] alpha = arrayed.split("");
        Arrays.sort(alpha);
        ArrayList<String> alphabet = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            alphabet.add(String.valueOf((char) i));
        }
        ArrayList<Integer> count = new ArrayList<>();
        for(int i =0; i<alphabet.size(); i++){
            count.add(0);
        }
        for (int i = 0; i < alpha.length; i++) {
            int idx = alphabet.indexOf(alpha[i]);
            int nVal= count.get(idx)+1;
            count.set(idx,nVal );
        }
        int large= 0;
        boolean check = false;
        for (int i=0; i< count.size(); i++){
            if(count.get(i)>large){
                large= count.get(i);
                check = true;
            } else if (count.get(i)==large) {
                check = false;
            }
        }
        if(check){
            System.out.println(alphabet.get(count.indexOf(large)).toUpperCase());
        }else {
            System.out.println("?");
        }

    }
}

