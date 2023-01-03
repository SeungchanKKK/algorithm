package com.example.algo.beakjoon;

import java.util.Scanner;
//영수증
public class re1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int price= sc.nextInt();
        int amt = sc.nextInt();
        int check =0;
        for(int i =0; i<amt; i++){
            int pct = sc.nextInt();
            int pAmt = sc.nextInt();
            check+=pct*pAmt;
        }
        if(check==price){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
