package com.example.algo.programmers;

import java.util.ArrayList;

public class NewsClustering {
    public int solution(String str1, String str2) {
        double answer = 0;
        double common = 0;
        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String>elements1 = new ArrayList<>();
        ArrayList<String>elements2 = new ArrayList<>();
        for (int i=0; i<str1.length()-1;i++){
            String element = str1.substring(i,i+2);
            if (element.matches("^[a-z|A-Z]*$")){
                elements1.add(element);
            }
        }
        for (int i=0; i<str2.length()-1;i++){
            String element2 = str2.substring(i,i+2);
            if (element2.matches("^[a-z|A-Z]*$")){
                elements2.add(element2);
            }
        }
        int ele2Length = elements2.size();
        for (int i=0; i<elements1.size(); i++){
            for (int j=0; j<elements2.size(); j++){
                if (elements1.get(i).equals(elements2.get(j))){
                    common++;
                    elements2.remove(elements2.get(j));
                    break;
                }
            }
        }
        if (common==0){
            if (elements1.size()+ele2Length-common>0){
                return 0;
            }
            return 65536;
        }
        answer= common/(elements1.size()+ele2Length-common)*65536;
        return (int)answer;
    }
}
