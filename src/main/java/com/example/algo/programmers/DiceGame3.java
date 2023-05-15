package com.example.algo.programmers;

import java.util.Arrays;

public class DiceGame3 {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = new int[query[i] + 1];
                for (int j = 0; j < answer.length; j++) {
                    answer[j] = arr[j];
                }
                arr = answer;
                System.out.println(Arrays.toString(answer));
            } else {
                answer = new int[answer.length - query[i]];
                int idx = 0;
                for (int j = query[i]; j < answer.length; j++) {
                    answer[idx] = arr[j];
                    idx++;
                }
                arr = answer;
                System.out.println(Arrays.toString(answer));
            }
        }
        return answer;
    }
}
