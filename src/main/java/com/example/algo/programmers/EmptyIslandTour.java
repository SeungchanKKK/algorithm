package com.example.algo.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmptyIslandTour {
    static int X = 0;
    static int Y = 0;
    static int day = 0;
    public int[] solution(String[] maps) {
        X = maps.length;
        Y = maps[0].length();

        int[][] map = new int[X][Y];
        for(int i = 0; i < X; i++) {
            char[] chars = maps[i].toCharArray();
            for(int j = 0; j < chars.length; j++) {
                if(chars[j] == 'X') {
                    map[i][j] = 0;
                } else {
                    map[i][j] = chars[j] - '0';
                }
            }
        }
        List<Integer> days = new ArrayList<>();
        boolean[][] visited = new boolean[X][Y];
        for(int i = 0; i < X; i++) {
            for(int j = 0; j < Y; j++) {
                if(!visited[i][j] && map[i][j] > 0) {
                    dfs(map, visited, i, j);
                    days.add(day);
                    day = 0;
                }
            }
        }
        if(days.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(days);
        int[] answer = new int[days.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = days.get(i);
        }

        return answer;
    }
    private void dfs(int[][] map, boolean[][] visited, int x, int y) {
        day += map[x][y];
        visited[x][y] = true;
        int[] upAndDown = {1, -1, 0, 0};
        int[] leftAndRight = {0, 0, 1, -1};

        for(int i = 0; i < 4; i++) {
            int newX = x + upAndDown[i];
            int newY = y + leftAndRight[i];

            if(newX < 0 || newY < 0 || newX >= X || newY >= Y) {
                continue;
            }

            if(!visited[newX][newY] && map[newX][newY] > 0) {
                dfs(map, visited, newX, newY);
            }
        }
    }
}
