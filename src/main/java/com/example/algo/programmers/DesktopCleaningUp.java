package com.example.algo.programmers;
//바탕화면정리
public class DesktopCleaningUp {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0]=51;
        answer[1]=51;
        for (int i =0; i< wallpaper.length; i++){
            for (int j=0; j<wallpaper[0].length();j++){
                String point = wallpaper[i].split("")[j];
                if(point.equals("#")){
                    if(answer[0]>i){
                        answer[0]=i;
                    }
                    if (answer[1]>j) {
                        answer[1]=j;
                    }
                    if (answer[2]<=i) {
                        answer[2]=i;
                    }
                    if (answer[3]<=j) {
                        answer[3]=j;
                    }
                }
            }
        }
        answer[2]++;
        answer[3]++;
        return answer;
    }
}
