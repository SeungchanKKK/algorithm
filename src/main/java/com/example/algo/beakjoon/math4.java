package com.example.algo.beakjoon;

import java.util.Scanner;
//부녀회장이 될테야
public class math4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++){
            int floor = sc.nextInt();
            int room = sc.nextInt();
            //동적계획법
        int people = roomNum(floor,room);
        //재귀용법
       // int people2 =getpeople(floor,room);
           System.out.println(people);
           // System.out.println(people2);
        }
    }
    // 동적계획법
    public static int roomNum(int floor,int room){
        int[][] cache = new int[floor+1][room];
        cache[0][0]=1;
        if(room>1){
            cache[0][1]=2;
        }
        cache[1][0]=1;
        for(int i=0; i<floor+1;i++){
            for (int j=0; j<room;j++){
                cache[i][0]=1;
                cache[0][j]=j+1;
            }
        }
        for (int i=1; i<floor+1;i++){
            for(int j=1; j<room;j++){
                cache[i][j]=cache[i][j-1]+cache[i-1][j];
            }
        }
        return cache[floor][room-1];
    }
    //재귀용법
    public static int getpeople(int floor,int room){
        if(room<2){
            return 1;
        } else if (floor==0) {
            return room;
        }
        return getpeople(floor-1,room)+getpeople(floor,room-1);
    }
}

