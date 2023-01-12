package com.example.algo.beakjoon;

import java.util.ArrayList;
import java.util.Scanner;
//골드바흐의 추측
public class n9020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0; i<N; i++){
            int num = sc.nextInt();
            ArrayList<Integer>pNum = new ArrayList<>();
            for (int j =2; j<num;j++){
                boolean check = true;
                for(int k =2; k<=Math.sqrt(j);k++){
                    if(j%k==0){
                        check=false;
                        break;
                    }
                }
                if(check){
                    pNum.add(j);
                }
            }
            int a= num/2;
            int b= num-a;
            while (a<num){
                if(pNum.contains(a)&&pNum.contains(b)){
                    System.out.println(a+" "+b);
                    break;
                }else {
                    a++;
                    b--;
                }
            }
        }
    }
}
