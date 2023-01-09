package com.example.algo.beakjoon;
//크로아티아 알파벳
import java.util.Scanner;

public class string9 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String in = sc.nextLine();
        String[] chart = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String changed=in;
        for (int i=0; i<chart.length; i++){
            changed=changed.replaceAll(chart[i],"ㄱ");
        }
        System.out.println(changed.length());
    }
}
