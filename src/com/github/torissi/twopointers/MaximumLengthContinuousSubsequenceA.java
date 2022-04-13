package com.github.torissi.twopointers;

import java.util.Scanner;

public class MaximumLengthContinuousSubsequenceA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int answer = 0;
        int point = 0;
        int count = 0; // 0을 1로 바꾼 횟수

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[point] == 0) {
                    count--;
                }

                point++;
            }

            answer = Math.max(answer, i - point + 1); // i - point + 1 -> 1을 연속적으로 갖는 수열의 길이
        }

        System.out.println(answer);
    }
}

/*
* 1. 길이 N 입력, k번 입력
* 2. 0과 1로 구성된 수열 입력
* 3. 최대 k번 0을 1로 변경하여 1로만 구성된 최대 길이 출력
* */
/*
ID	결과	Memory	Time
1
정답입니다
27MB
151ms
2
정답입니다
27MB
154ms
3
정답입니다
27MB
156ms
4
정답입니다
33MB
398ms
5
정답입니다
34MB
699ms
* */