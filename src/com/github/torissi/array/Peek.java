package com.github.torissi.array;

import java.util.Scanner;

public class Peek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num + 2][num + 2];
        int size = num + 1;
        int answer = 0;

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++ ) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                int temp = arr[i][j];
                int up = arr[i - 1][j];
                int down = arr[i + 1][j];
                int left = arr[i][j - 1];
                int right = arr[i][j +1];

                if (temp > up && temp > down &&
                        temp >left && temp > right ) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. N * N 격자판 입력
* 2. 자신의 숫자가 상하좌우 숫자 보다 크면 봉우리
* 3. 봉우리가 몇 개 있는 지 출력
* */
/*
ID	결과	Memory	Time
1
정답입니다
27MB
149ms
2
정답입니다
28MB
186ms
3
정답입니다
29MB
203ms
4
정답입니다
30MB
216ms
5
정답입니다
31MB
197ms

* */