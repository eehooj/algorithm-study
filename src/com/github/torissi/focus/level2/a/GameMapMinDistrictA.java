package com.github.torissi.focus.level2.a;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapMinDistrictA {

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        int answer;
        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);

        answer = visited[maps.length - 1][maps[0].length - 1];

        return answer == 0 ? -1 : answer;
    }

    private void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        int x = 0;
        int y = 0;
        visited[x][y] = 1;

        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1) {
                    continue;
                }

                if (visited[nx][ny] == 0 && maps[nx][ny] == 1) { // 아직 가지 않았고, 벽이 아니면
                    visited[nx][ny] = visited[cx][cy] + 1;

                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) {
        GameMapMinDistrictA a = new GameMapMinDistrictA();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

        System.out.println(a.solution(maps));
    }
}

/* 게임 맵 최단 거리
* 1. 나의 케릭터는 (1,1)에 위치
* 2. 상대팀은 (n,M)에 위치
* 3. 0인 부분은 벽이 있는 자리로, 움직일 수 없음
* 4. 1인 부분으로만 룸직일 수 있음
* 5. 상대팀에 도착하기 위해 지나가야 하는 칸의 개수의 최솟값 리턴
* 6. 못 가면 -1 리턴
* */