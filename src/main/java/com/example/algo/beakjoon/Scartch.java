package com.example.algo.beakjoon;

public class Scartch {
    public int[] solution(int N, int[] A) {
        int[]answer = new int[N];
        for (int i=0; i<A.length; i++){
            if (A[i]<=N){
                answer[A[i]-1]++;
            }else {
                int max = answer[i];
                for(int j=0; j<answer.length;j++){
                     max = 0;
                    answer[i]=max;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scartch scartch = new Scartch();
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        scartch.solution(5,arr);
    }
}
