package com.example.algo.beakjoon;

import java.util.*;

public class n2108 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>arrayList = new ArrayList<>();
        int amt = in.nextInt();
        int sum =0;
        int[] cnt = new int[8001];
        for(int i=0; i<amt; i++) {
            int num = in.nextInt();
            arrayList.add(num);
            sum+=num;
            if(num>=0){
                cnt[num+1000]++;
            }else {
                cnt[-num]++;
            }
        }
        int max=0;
        int value=0;
        int reset=0;
        for (int i=0; i< cnt.length;i++){
            if(cnt[i]>max){
                max=cnt[i];
                value=i;
            }else if(cnt[i]==max&&reset<2){
                max=cnt[i];
                value=i;
                reset++;
            }
        }
        Collections.sort(arrayList);
        int a = sum/arrayList.size();
        int b=arrayList.get(arrayList.size()/2);
        int c= value-1;
        int d = Collections.max(arrayList)-Collections.min(arrayList);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
