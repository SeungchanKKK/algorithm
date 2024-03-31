package com.example.algo.programmers;

import java.util.Arrays;

public class TriangleSnail {
    public int[] solution(int n) {
        int amount = (n*(n+1))/2;
        int[] answer = new int[amount];
        int turn = 0;
        String direction = "one";
        int rotate =0;
        int spin = n;
        int oneTrigger = rotate;
        int threeTrigger= n;
        int index=0;
        for (int i=0; i< answer.length; i++){
            if (direction.equals("one")){
                answer[index]=i+1;
                oneTrigger++;
                turn++;
                if (turn==spin){
                    direction="two";
                    index++;
                    spin--;
                    turn=0;
                }else {
                    index+=oneTrigger;
                }
            }else if(direction.equals("two")){
                answer[index]=i+1;
                turn++;
                if (turn==spin){
                    spin--;
                    direction="three";
                    index-=threeTrigger;
                    turn=0;
                }else {
                    index++;
                }
            }else {
                answer[index]=i+1;
                turn++;
                threeTrigger--;
                if (turn==spin){
                    spin--;
                    direction="one";
                    oneTrigger=0;
                    rotate+=2;
                    oneTrigger+=rotate;

                    threeTrigger=n;
                    threeTrigger-=rotate-1;
                    index+=oneTrigger;
                    turn=0;
                }else {
                    index-=threeTrigger;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TriangleSnail triangleSnail = new TriangleSnail();
        int[]a =triangleSnail.solution(13);
        System.out.println(Arrays.toString(a));
    }
}
