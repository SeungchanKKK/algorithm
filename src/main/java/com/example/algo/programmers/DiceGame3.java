package com.example.algo.programmers;

public class DiceGame3 {
    public int solution(int[] arr) {
        int answer = 0;
        while (true){
            boolean check = true;
            for (int i=0; i<arr.length;i++){
                int num = arr[i];
                if(num>=50&&num%2==0){
                    arr[i]=num/=2;
                    check= false;
                }
                if (num<50&&num%2==1){
                    arr[i]=num*2+1;
                    check= false;
                }
            }
            if (!check){
                answer++;
            }else {
                break;
            }
        }
        return answer;
    }
}
