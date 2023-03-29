package com.example.algo.programmers;

import java.util.Arrays;

public class WalkInPark {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] position = new int[2];
        Loop1:
        for (int i=0; i< park.length;i++){
            Loop2:
            for (int j=0; j<park[i].length();j++){
                String point=park[i].split("")[j];
                if(point.equals("S")){
                    position[0]=i;
                    position[1]=j;
                    break Loop1;
                }
            }
        }
        for (String route: routes){
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            int y = position[0];
            int x = position[1];
            boolean possiblity=true;
            for (int i=0;i<distance;i++){
                if(direction.equals("E")){
                    x++;
                } else if (direction.equals("W")) {
                    x--;
                }else if (direction.equals("S")) {
                    y++;
                }else {
                    y--;
                }
                if (x>=park[0].length()||y>= park.length||x<0||y<0||park[y].split("")[x].equals("X")){
                    possiblity=false;
                    break;
                }
            }
            if(possiblity){
                position[0]=y;
                position[1]=x;
            }
        }
        answer[0]=position[0];
        answer[1]=position[1];
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
