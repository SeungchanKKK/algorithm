package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//그룹 단어 체커
public class string10 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int answer =0;
        for(int i =0; i<N; i++){
            ArrayList<Character>cha = new ArrayList<>();
            String word = sc.next();
            cha.add(word.charAt(0));
            answer++;
            for(int j =1; j<word.length(); j++){
                if(cha.contains(word.charAt(j))){
                    if(word.charAt(j)!=word.charAt(j-1)){
                        answer--;
                        break;
                    }
                }else {
                    cha.add(word.charAt(j));
                }
            }
        }
        System.out.println(answer);
    }
}
