package com.example.algo.programmers;
//카펫
import java.util.ArrayList;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer>possible=yPossible(yellow,brown);
        int yGa;
        int ySe;
        for (int i=possible.size()/2; i<possible.size();i++){
             yGa = possible.get(i);
             ySe = yellow/yGa;
             if(yGa<ySe){
                 int temp= ySe;
                 ySe=yGa;
                 yGa=temp;
             }
             int totalDimen = (yGa+2)*(ySe+2);
             if(totalDimen==brown+yellow){
                answer[0]= yGa+2;
                answer[1]= ySe+2;
            }
        }return answer;
    }
    public ArrayList<Integer> yPossible(int yellow,int brown){
        ArrayList<Integer>divine = new ArrayList<>();
        for (int i=1; i<brown/2; i++){
            if(yellow%i==0){
                divine.add(i);
            }
        }
        return divine;
    }
}
