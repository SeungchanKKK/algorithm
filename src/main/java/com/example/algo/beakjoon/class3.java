package com.example.algo.beakjoon;

import java.util.Scanner;
//한수 재귀용법 적용
public class class3 {
    public static void main(String[] args){
        class3 class3 = new class3();
        class3.out();
        //System.out.println(class3.hanCheck(210,11));
    }

    public void out(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer=0;
        for (int i=1; i<=N; i++){
            if(hanCheck(i,11)){
                answer++;
            }
        }
        System.out.println(answer);
    }

    public boolean hanCheck(int a,int gap){
        if(a<100&&gap==11){
            return true;
        } else {
            int gapTemp= (a/10)%10-a%10;
            if(gap!=11){
                if(gapTemp!=gap){
                    return false;
                }
            }
            int num= a/10;
            if(num/10==0){
                return true;
            }
            return hanCheck(num,gapTemp);
        }
    }
}
