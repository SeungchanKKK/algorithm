package com.example.algo.programmers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class DeliveryBox {
    int answer = 0;
    Queue<Integer> line1 = new ArrayDeque<>();
    Stack<Integer> line2 = new Stack<>();

    public static void main(String[] args) {
        DeliveryBox deliveryBox = new DeliveryBox();
        int[] n = {4, 3, 2, 10, 6, 12, 13, 8, 7, 9, 11, 1, 5,};
        System.out.printf(String.valueOf(deliveryBox.solution(n)));
    }

    public int solution(int[] order) {
        for (int i = 1; i <= order.length; i++) {
            line1.add(i);
        }
        for (int i = 0; i < order.length; i++) {
            int require = order[i];
            if (!process(require)) {
                break;
            }
        }
        return answer;
    }

    public boolean process(int require) {
        if (!line1.isEmpty()) {
            if (line1.peek() == require) {
                line1.poll();
                answer++;
                return true;
            }
        }
        if (!line2.isEmpty()) {
            if (line2.peek() == require) {
                line2.pop();
                answer++;
                return true;
            }
        }
        if (line1.isEmpty()) {
            return false;
        } else {
            line2.push(line1.poll());
            return process(require);
        }
    }
}