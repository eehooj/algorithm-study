package com.github.torissi.programmers;

public class WeeklyThree_4_1 {
    //top-down
    public static int solution(int[][] triangle) {
        int rLength = triangle.length;
        int answer = 0;

        for (int i = 1; i < rLength; i++) {
            int cLength = triangle[i].length;

            for (int j = 0; j < cLength; j++) {
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                } else if (i == j) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                } else {
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }

                answer = Math.max(answer, triangle[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        solution(triangle);
    }
}


/*
* 1. 거쳐간 숫자의 합이 가장 큰 경우 찾기
* 2. 아래칸으로 이동할 땐 대각선 방향 한 칸 오른쪽 왼쪽만 이동 가능
* 3. 최대값 리턴
* */

/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.03ms, 71.2MB)
테스트 2 〉	통과 (0.03ms, 74.1MB)
테스트 3 〉	통과 (0.05ms, 77.2MB)
테스트 4 〉	통과 (0.06ms, 70.3MB)
테스트 5 〉	통과 (0.49ms, 77.7MB)
테스트 6 〉	통과 (0.10ms, 75.2MB)
테스트 7 〉	통과 (0.30ms, 73.8MB)
테스트 8 〉	통과 (0.10ms, 75.1MB)
테스트 9 〉	통과 (0.02ms, 74MB)
테스트 10 〉	통과 (0.06ms, 77.6MB)
효율성  테스트
테스트 1 〉	통과 (9.44ms, 61MB)
테스트 2 〉	통과 (9.40ms, 58.8MB)
테스트 3 〉	통과 (9.46ms, 61.3MB)
테스트 4 〉	통과 (9.65ms, 72.1MB)
테스트 5 〉	통과 (12.59ms, 59.9MB)
테스트 6 〉	통과 (9.61ms, 60.7MB)
테스트 7 〉	통과 (11.68ms, 59.8MB)
테스트 8 〉	통과 (8.70ms, 58.9MB)
테스트 9 〉	통과 (5.62ms, 59.4MB)
테스트 10 〉	통과 (10.09ms, 60.6MB)
채점 결과
정확성: 64.3
효율성: 35.7
합계: 100.0 / 100.0
* */