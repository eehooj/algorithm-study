package com.github.torissi.array;

import java.util.Scanner;

public class ScoreCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int answer = 0;

        for (int a : arr) {
            if (a == 0) {
                count = 0;
            } else {
                count++;
                answer += count;
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. 연속적으로 답을 맞추면 가산점을 줌
* 2. 처음 맞으면 1, 연속으로 맞으면 2, 3, .... 틀리면 0
* 3. 점수 합계
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
152ms
2
정답입니다
27MB
156ms
3
정답입니다
27MB
142ms
4
정답입니다
27MB
162ms
5
정답입니다
27MB
135ms
* */