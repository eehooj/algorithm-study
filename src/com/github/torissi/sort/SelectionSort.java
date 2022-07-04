package com.github.torissi.sort;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] answer = solution(n, arr);

        for (int item : answer) {
            System.out.print(item + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }
}


/*
* 1. N개의 숫자 입력
* 2. 오름차순으로 정렬한 수열 출력
* */

/*
* ID	결과	Memory	Time
1
정답입니다
27MB
137ms
2
정답입니다
27MB
156ms
3
정답입니다
27MB
174ms
4
정답입니다
27MB
177ms
5
정답입니다
27MB
179ms
* */