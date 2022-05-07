package com.github.torissi.programmers;

public class WeeklyThree_4 {
    //bottom-up
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
정확성  테스트
테스트 1 〉	통과 (0.04ms, 71MB)
테스트 2 〉	통과 (0.03ms, 71.4MB)
테스트 3 〉	통과 (0.04ms, 75.4MB)
테스트 4 〉	통과 (1.27ms, 75.3MB)
테스트 5 〉	통과 (0.30ms, 81MB)
테스트 6 〉	통과 (0.08ms, 81.1MB)
테스트 7 〉	통과 (0.20ms, 75.5MB)
테스트 8 〉	통과 (0.06ms, 75MB)
테스트 9 〉	통과 (0.05ms, 74.5MB)
테스트 10 〉	통과 (0.07ms, 77.7MB)
효율성  테스트
테스트 1 〉	통과 (6.35ms, 60MB)
테스트 2 〉	통과 (5.23ms, 59MB)
테스트 3 〉	통과 (6.76ms, 60.8MB)
테스트 4 〉	통과 (5.93ms, 59.7MB)
테스트 5 〉	통과 (6.96ms, 56.7MB)
테스트 6 〉	통과 (6.77ms, 61.3MB)
테스트 7 〉	통과 (6.59ms, 61.2MB)
테스트 8 〉	통과 (6.40ms, 59.4MB)
테스트 9 〉	통과 (4.59ms, 56.5MB)
테스트 10 〉	통과 (5.23ms, 57.6MB)
채점 결과
정확성: 64.3
효율성: 35.7
합계: 100.0 / 100.0
* */