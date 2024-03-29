package com.github.torissi.stackorqueue;

import java.util.Scanner;
import java.util.Stack;

public class PullingOutaCraneDoll {

    public static int solution(int[][] board, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int item : moves) {
            int length = board.length;
            item--;

            for (int i = 0; i < length; i++) {
                int temp = board[i][item];

                if (temp != 0) {
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        answer+=2;

                        stack.pop();
                    } else {
                        stack.push(temp);
                    }

                    board[i][item] = 0;

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int[] moves = new int[k];

        for (int i = 0; i < k; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.println(solution(board, moves));
    }

}

/*
* 1. N * N 정사각 격자
* 2. 모든 인형은 격자의 가장 아래 칸 부터 쌓여 있음
* 3. 크레인을 좌우로 움직여 멈춘 위치에서 가장 위에 있는 인형을 집어 올림
* 4. 그 인형을 다른 바구니에 가장 아래 칸 부터 순서대로 쌓임
* 5. 바구니에서 같은 모양 인형이 쌓이면 두 개 다 없어짐
* 6. 터뜨려서 사라진 인형의 갯수 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
160ms
2
정답입니다
27MB
177ms
3
정답입니다
27MB
157ms
4
정답입니다
28MB
190ms
5
정답입니다
30MB
195ms
* */

/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
> 4

6
0 0 0 0 0 0
0 0 1 0 3 1
0 2 5 0 1 1
4 2 4 4 2 3
3 5 1 3 1 3
4 2 4 4 2 3
10
1 5 3 5 1 2 1 4 3 4
> 6

10
0 0 0 0 0 0 0 0 0 0
0 0 1 0 3 1 0 0 1 2
0 2 5 0 1 1 7 7 0 5
4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5
4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5
3 5 1 3 1 3 5 7 3 5
15
1 5 3 5 1 2 1 4 3 4 7 8 9 7 8
> 8

20
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 1 0 3 1 0 0 1 2 0 0 1 0 3 1 0 0 1 2
0 2 5 0 1 1 7 7 0 5 0 2 5 0 1 1 7 7 0 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
30
1 5 3 5 1 2 1 4 3 4 7 8 9 7 8 1 15 13 5 1 12 11 14 13 14 17 18 19 17 18
> 12

30
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 1 0 3 1 0 0 1 2 0 0 1 0 3 1 0 0 1 2 0 0 1 0 3 1 0 0 1 2
0 2 5 0 1 1 7 7 0 5 0 2 5 0 1 1 7 7 0 5 0 2 5 0 1 1 7 7 0 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 6 7 4 7 4 2 4 4 2 3 6 7 4 7 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
4 2 4 4 2 3 3 2 1 5 4 2 4 4 2 3 3 2 1 5 3 5 1 3 1 3 5 7 3 5
3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5 3 5 1 3 1 3 5 7 3 5
70
1 5 3 5 1 2 1 4 3 4 7 8 9 7 8 1 15 13 5 1 12 11 14 13 14 17 18 19 17 18 25 26 27 30 29 1 5 3 5 1 2 1 4 3 4 7 8 9 7 8 1 15 13 5 1 12 11 14 13 14 17 18 19 17 18 25 26 27 30 29
> 16
* */