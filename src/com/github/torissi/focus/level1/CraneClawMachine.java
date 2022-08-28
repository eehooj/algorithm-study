package com.github.torissi.focus.level1;

import java.util.Stack;

public class CraneClawMachine {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        int length = moves.length;
        int bLenght = board.length;

        for (int i = 0; i < length; i++) { // moves
            int line = moves[i] - 1;

            for (int j = 0; j < bLenght; j++) { // board
                int item = board[j][line];

                if (item != 0) {
                    if (!basket.isEmpty() && basket.peek() == item) {
                        answer += 2;
                        basket.pop();
                    } else {
                        basket.push(item);
                    }

                    board[j][line] = 0;

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CraneClawMachine crane = new CraneClawMachine();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        crane.solution(board, moves);
    }
}

/*
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int temp = move - 1;

            for (int[] arr : board) {
                if (arr[temp] != 0) {
                    if (!stack.isEmpty() && stack.peek() == arr[temp]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(arr[temp]);
                    }

                    arr[temp] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.13ms, 61.5MB)
테스트 2 〉	통과 (0.13ms, 71.9MB)
테스트 3 〉	통과 (0.12ms, 58.9MB)
테스트 4 〉	통과 (1.24ms, 68.9MB)
테스트 5 〉	통과 (0.14ms, 59.2MB)
테스트 6 〉	통과 (0.13ms, 75.3MB)
테스트 7 〉	통과 (0.25ms, 68.1MB)
테스트 8 〉	통과 (0.95ms, 72.4MB)
테스트 9 〉	통과 (0.68ms, 71.9MB)
테스트 10 〉	통과 (0.45ms, 69.4MB)
테스트 11 〉	통과 (0.88ms, 58.5MB)
* */

/* 크레인 인형뽑기 게임
* 1. N * N 격자
* 2. 집어올린 인형은 바구니에 쌓임
* 3. 같은 모양의 인형이 바구니에 연달아 쌓이면 두 인형은 터뜨려 없어짐
* 4. 터뜨려 사라진 인형의 갯수 리턴
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.11ms, 77.7MB)
테스트 2 〉	통과 (0.12ms, 73.9MB)
테스트 3 〉	통과 (0.12ms, 76.7MB)
테스트 4 〉	통과 (1.12ms, 75.7MB)
테스트 5 〉	통과 (0.12ms, 83MB)
테스트 6 〉	통과 (0.13ms, 73.6MB)
테스트 7 〉	통과 (0.20ms, 73.7MB)
테스트 8 〉	통과 (0.40ms, 75.8MB)
테스트 9 〉	통과 (0.45ms, 80MB)
테스트 10 〉	통과 (0.43ms, 78.7MB)
테스트 11 〉	통과 (0.82ms, 75.4MB)
* */