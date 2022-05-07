package com.github.torissi.programmers;

public class WeeklyThree_4 {

    public static int solution(int[][] triangle) {
        int rLength = triangle.length - 2;

        for (int i = rLength; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        return triangle[0][0];
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
정확성 테스트
테스트 1 〉 통과 (0.03ms, 73.8MB)
테스트 2 〉 통과 (0.03ms, 72.6MB)
테스트 3 〉 통과 (0.02ms, 68.4MB)
테스트 4 〉 통과 (0.02ms, 78.7MB)
테스트 5 〉 통과 (0.02ms, 81.8MB)
테스트 6 〉 통과 (0.02ms, 73.2MB)
테스트 7 〉 통과 (0.01ms, 76.7MB)
테스트 8 〉 통과 (0.01ms, 75.8MB)
테스트 9 〉 통과 (0.02ms, 77MB)
테스트 10 〉 통과 (0.02ms, 73.7MB)
테스트 11 〉 통과 (0.02ms, 77.7MB)
테스트 12 〉 통과 (0.02ms, 78.5MB)
테스트 13 〉 통과 (0.01ms, 74.5MB)
테스트 14 〉 통과 (0.02ms, 74.7MB)
채점 결과
정확성: 100.0
효율성: 0.0
합계: 100.0 / 100.0
* */