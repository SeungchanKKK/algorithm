package com.example.algo.beakjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//너의 평점은
public class n25206 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total =0;
        double sum =0;
        Map<String,Double>chart = new HashMap<>();
        chart.put("A+",4.5);
        chart.put("A0",4.0);
        chart.put("B+",3.5);
        chart.put("B0",3.0);
        chart.put("C+",2.5);
        chart.put("C0",2.0);
        chart.put("D+",1.5);
        chart.put("D0",1.0);
        chart.put("F",0.0);
        chart.put("P",0.0);
        for (int i=0; i<20; i++){
            String input = sc.nextLine();
            if(!input.split(" ")[2].equals("P")){
                total+=Double.parseDouble(input.split(" ")[1]);
                sum+=Double.parseDouble(input.split(" ")[1])*chart.get(input.split(" ")[2]);
            }
        }
        System.out.printf("%.6f",sum/total);
    }
}
