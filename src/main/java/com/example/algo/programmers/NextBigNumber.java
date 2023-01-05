package com.example.algo.programmers;
//다음큰숫자
public class NextBigNumber {
    public int solution(int n) {
        String bi = Integer.toBinaryString(n);
        int cnt1 = 0;
        for (int i = 0; i < bi.length(); i++) {
            if (bi.charAt(i) == '1') {
                cnt1++;
            }
        }
        int cnt12= 0;
        int answer = n+1;
        while (true){
            String bi2= Integer.toBinaryString(answer);
            for (int i = 0; i < bi2.length(); i++) {
                if (bi2.charAt(i) == '1') {
                    cnt12++;
                }
            }
            if (cnt1==cnt12){
                break;
            }else {
                cnt12=0;
                answer++;
            }
        }
        return answer;
    }
}
