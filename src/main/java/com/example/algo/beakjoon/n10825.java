package com.example.algo.beakjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class n10825 {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static String[][] arr = new String[N][4];
    public static void main(String[] args) {
        for (int i=0; i<N; i++){
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = sc.next();
            arr[i][3] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o2[1].equals(o1[1])){
                    if(o1[2].equals(o2[2])){
                        if(o1[3].equals(o2[3])){
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
                    }

                    return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);

                }
                return Integer.parseInt(o2[1])- Integer.parseInt(o1[1]);
            }
        });
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]);
        }
    }
}
