package com.github.torissi.array;

import java.util.Scanner;

public class RankingA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            int count = 1;

            for (int j = 0; j < num; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }

            answer[i] = count;
        }

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}

/*
* 1. 국어 점수 입력
* 2. 입력 순서대로 등수 출력
* 3. 같은 점수일 경우 같은 등수 -> 1등이 3명이면 그 다음 등수는 4등
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
148ms
2
정답입니다
27MB
149ms
3
정답입니다
27MB
153ms
4
정답입니다
27MB
153ms
5
정답입니다
27MB
134ms
* */