package com.example.algo.programmers;

public class DrawingDot {
    public long solution(int k, int d) {
        long answer = 0;
        int yMax = d;
        for (int x=0; x<=d; x+=k){
            long dd = (long) d * d;
            long xx = (long) x * x;
            int top = (int) Math.sqrt(dd - xx);
            answer += (top / k) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        DrawingDot drawingDot = new DrawingDot();
        long a= drawingDot.solution(1,5);
        System.out.println(a);
    }
}

