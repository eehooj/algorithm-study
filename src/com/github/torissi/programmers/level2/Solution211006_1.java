package com.github.torissi.programmers.level2;


public class Solution211006_1 {

    public static int solution(int [][]board) {
        int max = 0;
        int length = board.length;
        int length1 = board[0].length;
        int[][] newBoard = new int[length + 1][length1 + 1];

        for(int i=0; i<length; i++)
            System.arraycopy(board[i], 0, newBoard[i + 1], 1, length1);

        for (int i = 1; i < newBoard.length; i++) {
            for (int j = 1; j < newBoard[i].length; j++) {
                if (newBoard[i][j] == 1) {
                    int up = newBoard[i - 1][j];
                    int left = newBoard[i][j - 1];
                    int leftUp = newBoard[i - 1][j - 1];
                    int min = Math.min(up, Math.min(left, leftUp));

                    newBoard[i][j] = min + 1;
                    max = Math.max(max, min + 1);
                }
            }
        }

        return max * max;
    }

    public static void main(String[] args) {
        int [][]board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        solution(board);
    }
}

/*https://zzang9ha.tistory.com/189*/

/* 가장 큰 정사각형 찾기
문제 설명
1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

예를 들어

1	2	3	4
0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
가 있다면 가장 큰 정사각형은

1	2	3	4
0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.

제한사항
표(board)는 2차원 배열로 주어집니다.
표(board)의 행(row)의 크기 : 1,000 이하의 자연수
표(board)의 열(column)의 크기 : 1,000 이하의 자연수
표(board)의 값은 1또는 0으로만 이루어져 있습니다.
입출력 예
board	answer
[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
[[0,0,1,1],[1,1,1,1]]	4
입출력 예 설명
입출력 예 #1
위의 예시와 같습니다.

입출력 예 #2
| 0 | 0 | 1 | 1 |
| 1 | 1 | 1 | 1 |
로 가장 큰 정사각형의 넓이는 4가 되므로 4를 return합니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 71.9MB)
테스트 2 〉	통과 (0.04ms, 70.7MB)
테스트 3 〉	통과 (0.04ms, 78MB)
테스트 4 〉	통과 (0.07ms, 81.3MB)
테스트 5 〉	통과 (0.07ms, 73.8MB)
테스트 6 〉	통과 (0.04ms, 71.9MB)
테스트 7 〉	통과 (0.06ms, 64.8MB)
테스트 8 〉	통과 (0.03ms, 75.6MB)
테스트 9 〉	통과 (0.04ms, 73.7MB)
테스트 10 〉	통과 (0.04ms, 74.7MB)
테스트 11 〉	통과 (0.04ms, 79.4MB)
테스트 12 〉	통과 (0.04ms, 77.8MB)
테스트 13 〉	통과 (0.05ms, 79.4MB)
테스트 14 〉	통과 (0.04ms, 74.4MB)
테스트 15 〉	통과 (0.05ms, 87.5MB)
테스트 16 〉	통과 (0.07ms, 66.7MB)
테스트 17 〉	통과 (0.07ms, 73.9MB)
테스트 18 〉	통과 (0.33ms, 78.6MB)
테스트 19 〉	통과 (0.29ms, 77.1MB)
효율성  테스트
테스트 1 〉	통과 (13.15ms, 89.9MB)
테스트 2 〉	통과 (13.87ms, 89.8MB)
테스트 3 〉	통과 (13.97ms, 90MB)
*/
