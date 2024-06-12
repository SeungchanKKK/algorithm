package com.example.algo.beakjoon;

import java.util.Scanner;

public class N14888 {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int[] numArr = new int[N];
    static int[] calArr = new int[4];
    static int[] calOrder = new int[N-1];

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static void DFS(int k){
        if (k==N-1){
            max=Math.max(max,calculation());
            min=Math.min(min,calculation());
        }else {
            for (int i=0; i<calArr.length; i++){
                if (calArr[i]!=0){
                    calOrder[k] = i;
                    calArr[i]-=1;
                    DFS(k+1);
                    calArr[i]+=1;
                }
            }
        }
    }
    //0 = +  1= - 2= * 3= /
    static int calculation(){
        int result = numArr[0];
        for (int i=1; i<numArr.length; i++){
            int num = numArr[i];
            switch (calOrder[i-1]){
                case 0:
                    result+=num;
                    break;
                case 1:
                    result-=num;
                    break;
                case 2:
                    result*=num;
                    break;
                case 3:
                    result/=num;
                    break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        for (int i=0; i< numArr.length; i++){
            numArr[i]= sc.nextInt();
        }
        for (int i=0; i< 4; i++){
            calArr[i] =  sc.nextInt();
        }
        DFS(0);
        System.out.println(max);
        System.out.println(min);
    }
}
