package com.example.algo;

import com.example.algo.programmers.CoupleRemove;
import com.example.algo.programmers.FollowUp;
import com.example.algo.programmers.LifeBoat;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        LifeBoat lifeBoat = new LifeBoat();
        int[] words ={70, 50, 80, 50};
        System.out.println(lifeBoat.solution(words,100));
    }
}
