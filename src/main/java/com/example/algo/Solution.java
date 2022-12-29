package com.example.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
//프로그래머스 lv1 신고결과 받기
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,Integer>banCnt= new HashMap<>();
        ArrayList<String>banned = new ArrayList<>();
        //신고횟수목록 값배치
        for(String id: id_list){
            banCnt.put(id,0);
        }
        //중복신고 제거
        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>(Arrays.asList(report));
        String[] Creport = linkedHashSet.toArray(new String[0]);
        //신고횟수카운트
        for (String list : Creport){
            String[] split = list.split(" ");
            String reported = split[1];
            banCnt.replace(reported,banCnt.get(reported)+1);
        }
        //정지계정선별
        for(String id: id_list){
            if(banCnt.get(id)>=k){
                banned.add(id);
            }
        }
        //신고기록 조회에서 메일보내기
        for (String list : Creport){
            String[] split = list.split(" ");
            String reporter =split[0];
            String reported = split[1];
            if(banned.contains(reported)){
                answer[Arrays.asList(id_list).indexOf(reporter)]++;
            }
        }
        return answer;
    }
}
