package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.HashMap;
//개인정보 수집 유효기간
public class PrivacyContain {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String,Integer>term = new HashMap<>();
        for (int i=0; i< terms.length;i++){
            term.put(terms[i].split(" ")[0],Integer.parseInt(terms[i].split(" ")[1])*28);
        }
        ArrayList<Integer>expired= new ArrayList<>();
        for (int i =0; i<privacies.length;i++){
            String date = privacies[i].split(" ")[0];
            String pTerms = privacies[i].split(" ")[1];
            int pExp = dateInter(date)+term.get(pTerms);
            Integer checkD= dateInter(today);
            if (pExp<=checkD){
                expired.add(i+1);
            }
        }
        int[] answer = new int[expired.size()];
        for(int i=0; i<expired.size(); i++){
            answer[i]= expired.get(i);
        }
        return answer;
    }

    public Integer dateInter(String date){
        String[] sp= date.split("\\.");
        Integer result=0;
        result+=Integer.parseInt(sp[0])*12*28;
        result+=Integer.parseInt(sp[1])*28;
        result+=Integer.parseInt(sp[2]);
        return result;
    }
}
