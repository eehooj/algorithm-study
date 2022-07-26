package com.github.torissi.sort;

import java.util.Scanner;

public class InsertionSort {

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
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = temp;
        }

        return arr;
    }
}

/*
ID	결과	Memory	Time
1
정답입니다
27MB
169ms
2
정답입니다
27MB
146ms
3
정답입니다
27MB
158ms
4
정답입니다
27MB
166ms
5
정답입니다
27MB
129ms
* */