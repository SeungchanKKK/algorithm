package com.example.algo.programmers;

import java.util.ArrayList;

public class Network {
    public static void main(String[] args) {
        Network network = new Network();
        network.solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}});
    }
    int answer = 0;
    ArrayList<Integer>nodes = new ArrayList<>();
    public int solution(int n, int[][] computers) {
        for (int i = 0; i < computers.length; i++) {
            for (int j=i+1; j<computers.length; j++) {
                    DFS(computers[i][j],computers,j);
            }
        }
        return answer;
    }

    public void DFS(int d, int[][] computers,int connect) {
        if (d==0) {
            answer++;
        } else {
            for (int i=connect+1; i<computers.length;i++){
                DFS(computers[connect][i],computers,i);
            }
        }
        }
    }
