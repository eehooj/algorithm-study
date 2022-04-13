package com.github.torissi.slidingwindow;

import java.util.Scanner;

public class ContinuousPartialSequenceA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int point = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= arr[point];

                if (sum == m) {
                    answer++;
                }

                point++;
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. N개, 특정 합 M 입력
* 2. 특정 숫자 M이 되는 경우의 수 출력
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
185ms
3
정답입니다
31MB
256ms
4
정답입니다
32MB
280ms
5
정답입니다
34MB
778ms
* */