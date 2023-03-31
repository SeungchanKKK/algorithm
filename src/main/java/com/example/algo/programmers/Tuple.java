package com.example.algo.programmers;

import java.util.*;
//튜플
public class Tuple {
    public int[] solution(String s) {
        String newS = s.replace("{","").replace("}","");
        String[] numArr = newS.split(",");
        Map<Integer,Integer>numCount = new HashMap<>();
        for (String num: numArr){
            int number =Integer.parseInt(num);
            if(numCount.containsKey(number)){
                numCount.put(number,numCount.get(number)+1);
            }else {
                numCount.put(number,1);
            }
        }
        List<Integer>valueList = new ArrayList<>(numCount.values());
        Collections.sort(valueList,Collections.reverseOrder());
        int[]answer = new int[valueList.size()];
        for (int i=0; i<valueList.size(); i++){
            answer[i]=getKey(numCount,valueList.get(i));
        }
        return answer;
    }

    public int getKey(Map<Integer,Integer>map ,int i) {
        for (int key : map.keySet()) {
            if (i==(map.get(key))) {
                return key;
            }
        }
        return 0;
    }
}
