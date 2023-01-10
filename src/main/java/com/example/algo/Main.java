package com.example.algo;

import com.example.algo.programmers.CoupleRemove;
import com.example.algo.programmers.FollowUp;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        FollowUp followUp = new FollowUp();
        String[] words ={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(followUp.solution(3, words)));
    }
}
