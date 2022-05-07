package com.github.torissi.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class WeeklyThree_2_1 {

    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int height, int width) {
            if (x < 0 || x >= width) {
                return false;
            }

            if (y < 0 || y >= height) {
                return false;
            }

            return true;
        }
    }

    public static int solution(int[][] maps) {
        int mapHeight = maps.length;
        int mapWidth = maps[0].length;

        Queue<Position> queue = new LinkedList<>();
        int[][] count = new int[mapHeight][mapWidth];
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        queue.offer(new Position(0, 0));
        count[0][0] = 1;
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();
            int currentCount = count[current.y][current.x];

            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 상하좌우

            for (int[] item : moving) {
                Position moved = new Position(current.x + item[0], current.y + item[1]);

                if (!moved.isValid(mapHeight, mapWidth)) { // 맵 범위 안 여부
                    continue;
                }

                if (visited[moved.y][moved.x]) { // 이미 방문
                    continue;
                }

                if (maps[moved.y][moved.x] == 0) { // 벽
                    continue;
                }

                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }

        boolean b = count[mapHeight - 1][mapWidth - 1] == 0;

        return b ? -1 : count[mapHeight - 1][mapWidth -1];
    }

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        solution(maps);
    }
}


/*
* 1. n X m 맵
* 2. 상대 진영에 더 빨리 도착해야함
* 3. 1은 갈 수 있는 길, 0은 갈 수 없는 길
* 4. 모두 1인 경우는 주어지지 않음
* 5. 첫 시작은 (1, 1), 상대 진영은 (n, m)
* 6. 상대팀에 도착하는 칸의 갯수 최소값을 리턴 (도착 못할 경우 -1 리턴)
* */

/* 
정확성  테스트
테스트 1 〉	통과 (0.36ms, 73.7MB)
테스트 2 〉	통과 (0.43ms, 74.5MB)
테스트 3 〉	통과 (0.37ms, 69.6MB)
테스트 4 〉	통과 (0.33ms, 72.4MB)
테스트 5 〉	통과 (0.52ms, 76.3MB)
테스트 6 〉	통과 (0.36ms, 77.5MB)
테스트 7 〉	통과 (0.49ms, 75.8MB)
테스트 8 〉	통과 (0.38ms, 72.2MB)
테스트 9 〉	통과 (0.35ms, 72.2MB)
테스트 10 〉	통과 (0.54ms, 75.7MB)
테스트 11 〉	통과 (0.49ms, 64.7MB)
테스트 12 〉	통과 (0.38ms, 74.4MB)
테스트 13 〉	통과 (0.38ms, 76.4MB)
테스트 14 〉	통과 (0.48ms, 82.4MB)
테스트 15 〉	통과 (0.48ms, 75.6MB)
테스트 16 〉	통과 (0.46ms, 72.9MB)
테스트 17 〉	통과 (0.69ms, 73.3MB)
테스트 18 〉	통과 (0.31ms, 76.1MB)
테스트 19 〉	통과 (0.43ms, 78.5MB)
테스트 20 〉	통과 (0.40ms, 78.5MB)
테스트 21 〉	통과 (0.37ms, 70.3MB)
효율성  테스트
테스트 1 〉	통과 (16.38ms, 63.8MB)
테스트 2 〉	통과 (6.33ms, 70.1MB)
테스트 3 〉	통과 (12.70ms, 60.5MB)
테스트 4 〉	통과 (9.55ms, 57.1MB)
채점 결과
정확성: 69.9
효율성: 30.1
합계: 100.0 / 100.0
* */