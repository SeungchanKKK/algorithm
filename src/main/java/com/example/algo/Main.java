package com.example.algo;

import com.example.algo.programmers.NextBigNumber;
import com.example.algo.programmers.PrivacyContain;

import java.util.Arrays;

public class Main {
    public static void main(String[] ars) {
        PrivacyContain privacyContain = new PrivacyContain();
        String[] a={"A 6", "B 12", "C 3"};
        String[] b={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] answer = privacyContain.solution("2022.05.19",a,b);
        System.out.println(Arrays.toString(answer));
    }
}
