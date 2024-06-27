package com.example.algo.codility;

public class BinaryGap {
    public int solution(int N) {
        int gapLength =0;
        String binary = Integer.toBinaryString(N);
        boolean start =false;
        int tempLength = 0;
        for(int i=0; i<binary.length(); i++){
            if (binary.charAt(i)=='1'){
                if (!start){
                    start = true;
                }else {
                    if (gapLength<tempLength){
                        gapLength=tempLength;
                    }
                    tempLength=0;
                }
            }else {
                tempLength++;
            }
        }
        return gapLength;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(1041));
    }
}
