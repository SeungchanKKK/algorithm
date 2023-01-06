package com.example.algo.beakjoon;

import java.util.ArrayList;

//셀프넘버
public class class2 {
    public static void main(String[] args){
        class2 class2 = new class2();
        class2.out();
    }
    public void out(){
        ArrayList<Integer>selfNum = new ArrayList<>();
        for(int i=1; i<=10000; i++){
            selfNum.add(i);
        }
        for (int i=1; i<10000; i++){
            if(selfNum.contains(genNum(i))){
                selfNum.remove(Integer.valueOf(genNum(i)));
            }
        }
       for (int i =0; i<selfNum.size();i++){
           System.out.println(selfNum.get(i));
       }
    }
    public int genNum(int a){
        int b=a;
        while (b>0){
            a+=b%10;
            b/=10;
        }
        return a;
    }
}
