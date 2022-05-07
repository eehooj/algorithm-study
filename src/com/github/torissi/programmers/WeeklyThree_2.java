package com.github.torissi.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class WeeklyThree_2 {

    public int solution(int[][] maps) {
        boolean[][] visit = new boolean[maps.length][maps[0].length];

        return bfs(maps, visit);
    }

    private int bfs(int[][] maps, boolean[][] visit) {
        int[] dx = {-1, 1, 0, 0}; // 상하좌우
        int[] dy = {0, 0, -1, 1}; // 좌우상하
        Queue<Node> que = new LinkedList<>();

        que.offer(new Node(0, 0, 1)); // 내 시작 위치

        visit[0][0] = true;

        while (!que.isEmpty()) {
            Node node = que.poll();
            int xlength = maps[0].length;
            int ylength = maps.length;

            if (node.x == xlength - 1 && node.y == ylength - 1) { // 도착지
                return node.count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || nx >= xlength
                        || ny < 0 || ny >= ylength
                        || visit[ny][nx] || maps[ny][nx] == 0) {
                    continue;
                }

                que.offer(new Node(nx, ny, node.count+1));
                visit[ny][nx] = true;
            }
        }

        return -1;
    }

    private static class Node {
        private int x;
        private int y;
        private int count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
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
정확성 테스트
테스트 1 〉 통과 (0.38ms, 73.7MB)
테스트 2 〉 통과 (0.29ms, 81MB)
테스트 3 〉 통과 (0.31ms, 75.4MB)
테스트 4 〉 통과 (0.29ms, 79.3MB)
테스트 5 〉 통과 (0.43ms, 71.7MB)
테스트 6 〉 통과 (0.31ms, 78.7MB)
테스트 7 〉 통과 (0.47ms, 76.9MB)
테스트 8 〉 통과 (0.33ms, 71.8MB)
테스트 9 〉 통과 (0.39ms, 71.2MB)
테스트 10 〉 통과 (0.34ms, 76.6MB)
테스트 11 〉 통과 (0.30ms, 78.1MB)
테스트 12 〉 통과 (0.32ms, 71.1MB)
테스트 13 〉 통과 (1.35ms, 78.3MB)
테스트 14 〉 통과 (0.39ms, 74MB)
테스트 15 〉 통과 (0.35ms, 74.7MB)
테스트 16 〉 통과 (0.34ms, 75.4MB)
테스트 17 〉 통과 (0.35ms, 73MB)
테스트 18 〉 통과 (0.39ms, 73.2MB)
테스트 19 〉 통과 (0.29ms, 76.7MB)
테스트 20 〉 통과 (0.37ms, 75.8MB)
테스트 21 〉 통과 (0.38ms, 72.8MB)
효율성 테스트
테스트 1 〉 통과 (6.86ms, 54.2MB)
테스트 2 〉 통과 (2.88ms, 52.5MB)
테스트 3 〉 통과 (4.35ms, 52.6MB)
테스트 4 〉 통과 (4.72ms, 52.5MB)
채점 결과
정확성: 69.9
효율성: 30.1
합계: 100.0 / 100.0
* */