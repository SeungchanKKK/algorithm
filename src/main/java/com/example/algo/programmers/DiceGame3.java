package com.example.algo.programmers;

public class DiceGame3 {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num: num_list){
            while (num!=1){
                if(num%2==0){
                    num/=2;
                    answer++;
                }else {
                    num=(num-1)/2;
                    answer++;
                }
            }
        }
        return answer;
    }
}
