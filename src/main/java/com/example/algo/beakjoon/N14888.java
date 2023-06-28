package com.example.algo.beakjoon;

import java.util.Scanner;

public class N14888 {
    static int max;
    static int min;
    static Scanner sc = new Scanner(System.in);
    static int[]nums;
    static int[]operaters= new int[5];
    static int[]orders;
    static int result;
    static int repeat ;

    static int calculator(int[]orders,int[] nums){
        //nums,order
        result = nums[1];
        for (int i=1; i<orders.length;i++){
            int order = orders[i];
            if(order==1){
                result+=nums[i+1];
            }else if(order==2){
                result-=nums[i+1];
            }else if(order==3){
                result*=nums[i+1];
            }else {
                result/=nums[i+1];
            }
        }
        return result;
    }
    static void reFun(int k){
        if (k== nums.length-1){
            int result = calculator(orders,nums);
            if(result<min){
                min=result;
            }
            if (result>max){
                max=result;
            }
        }else {
            for (int cand=1; cand<=4; cand++){
                if (operaters[cand]>=1){
                    operaters[cand]--;
                    orders[k]=cand;
                    reFun(k+1);
                    operaters[cand]++;
                    orders[k]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        repeat = sc.nextInt();
        nums = new int[repeat+1];
        orders= new int[repeat];
        for (int i=1; i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for (int i=1; i<=4;i++){
            operaters[i]=sc.nextInt();
        }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        reFun(1);
        System.out.println(max);
        System.out.println(min);
    }
}
