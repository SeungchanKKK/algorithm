package com.example.algo.beakjoon;

import java.util.Scanner;

public class class3 {
    public static void main(String[] args){
        class3 class3 = new class3();
        class3.out();
    }

    public void out(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer=0;
        for (int i=1; i<=N; i++){
            if(hanCheck(i)){
                answer++;
            }
        }
        System.out.println(answer);
    }

    public boolean hanCheck(int a){
        if(a<100){
            return true;
        } else if (a==1000) {
            return false;
        } else {
            int gap= (a/10)%10-a%10;
            int gap2 =(a/10)/10%10-(a/10)%10;
            if(gap2==gap){
                return true;
            }
            return false;
        }
    }
}
