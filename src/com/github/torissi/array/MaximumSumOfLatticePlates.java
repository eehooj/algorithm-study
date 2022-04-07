package com.github.torissi.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumSumOfLatticePlates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        List<Integer> list = new ArrayList<>();

        int rightDiagonalSum = 0; // 우측방향 대각선
        int leftDiagonalSum = 0; // 좌측방향 대각선

        for (int i = 0; i < num; i++) {
            int rowSum = 0; // 행
            int columnSum = 0; // 열

            for (int j = 0; j < num; j++) {
                rowSum += arr[i][j];
                columnSum += arr[j][i];

                if (i == j) {
                    rightDiagonalSum += arr[i][j];
                }

                if (j == num - 1 - i) {
                    leftDiagonalSum += arr[i][j];
                }
            }

            list.add(rowSum);
            list.add(columnSum);
        }

        list.add(rightDiagonalSum);
        list.add(leftDiagonalSum);

        int max = 0;

        for (int a : list) {
            if (a > max) {
                max = a;
            }
        }

        System.out.println(max);
    }
}

/*
* 1. 국어 점수 입력
* 2. 입력 순서대로 등수 출력
* 3. 같은 점수일 경우 같은 등수 -> 1등이 3명이면 그 다음 등수는 4등
* */

/* list.sort(Integer::compareTo);
ID	결과	Memory	Time
1
정답입니다
33MB
354ms
2
정답입니다
33MB
363ms
3
정답입니다
34MB
414ms
4
정답입니다
34MB
415ms
5
정답입니다
34MB
398ms
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
154ms
2
정답입니다
27MB
188ms
3
정답입니다
30MB
222ms
4
정답입니다
30MB
198ms
5
정답입니다
31MB
220ms
* */