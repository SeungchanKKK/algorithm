package com.example.algo.programmers;

public class Elevator {
    public int solution(int storey) {
        int answer = 0;
        while (storey>0){
            int num = storey%10;
            storey/=10;
            if (num>5){
                answer+=(10-num);
                storey+=1;
            } else if (num==5) {
                if (storey%10>=5){
                    storey++;
                    answer+=(10-num);
                }else {
                    answer+=num;
                }
            } else {
                answer+=num;
            }
        }
        return answer;
    }
}
