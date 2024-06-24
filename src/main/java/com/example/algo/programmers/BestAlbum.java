package com.example.algo.programmers;

import java.util.*;

public class BestAlbum {
    static class GenreRanking{
        Songs ranking1;
        Songs ranking2;

        public GenreRanking(Songs ranking1, Songs ranking2) {
            this.ranking1 = ranking1;
            this.ranking2 = ranking2;
        }

        static class Songs{
            public Songs(int idx, int listen) {
                this.idx = idx;
                this.listen = listen;
            }

            int idx;
            int listen;
        }
    }
    public void rankingCheck(HashMap<String,GenreRanking>genreRank,String genre, int play, int idx){
        GenreRanking ranking = genreRank.getOrDefault(genre, new GenreRanking(new GenreRanking.Songs(10001,0),new GenreRanking.Songs(10001,0)));
        if (ranking.ranking1.listen<play){
            ranking.ranking2.idx = ranking.ranking1.idx;
            ranking.ranking2.listen = ranking.ranking1.listen;
            ranking.ranking1.idx = idx;
            ranking.ranking1.listen = play;
        } else if (ranking.ranking1.listen==play&&ranking.ranking1.idx>idx) {
                ranking.ranking2.idx = ranking.ranking1.idx;
                ranking.ranking2.listen = ranking.ranking1.listen;
                ranking.ranking1.idx = idx;
                ranking.ranking1.listen = play;
        } else {
            if (ranking.ranking2.listen<play){
                ranking.ranking2.idx = idx;
                ranking.ranking2.listen = play;
            }
            if (ranking.ranking2.listen==play&&ranking.ranking2.idx>idx){
                ranking.ranking2.idx = idx;
                ranking.ranking2.listen = play;
            }
        }
        genreRank.put(genre,ranking);
    }
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String,Integer>genreCount = new HashMap<>();
        HashMap<String,GenreRanking>genreRank = new HashMap<>();
        for (int i =0; i<plays.length; i++){
            genreCount.put(genres[i], genreCount.getOrDefault(genres[i],0)+plays[i]);
            rankingCheck(genreRank,genres[i],plays[i],i);
        }
        List<String> keyset = new ArrayList<>(genreCount.keySet());
        keyset.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return genreCount.get(o2).compareTo(genreCount.get(o1));
            }
        });
        for (String key:keyset){
            if (genreRank.get(key).ranking1.idx!=10001){
                answer.add(genreRank.get(key).ranking1.idx);
            }
            if (genreRank.get(key).ranking2.idx!=10001){
                answer.add(genreRank.get(key).ranking2.idx);
            }
        }
        return answer;
    }
}
