package com.example.algo.programmers;

public class TargetNumber {
    public static void main(String[] args) {
        TargetNumber targetNumber = new TargetNumber();
        targetNumber.solution(new int[]{1, 1, 1, 1, 1},3);
    }
    int answer =0;
    int sum =0;
    int[] arr;
    public int solution(int[] numbers, int target) {
        arr = new int[numbers.length];
        return DFS(0,numbers,target);
    }

    public int DFS(int k,int[] numbers, int target){
        if (k==numbers.length){
            for (int i=0; i<numbers.length; i++){
                if (arr[i]==0){
                    sum+=numbers[i];
                }else {
                    sum-=numbers[i];
                }
            }
            if (sum==target){
                answer++;
            }
            sum=0;
        }else {
            for (int i=0; i<2; i++){
                arr[k]=i;
                DFS(k+1,numbers,target);
            }
        }
        return answer;
    }
}
