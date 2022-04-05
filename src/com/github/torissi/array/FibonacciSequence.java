package com.github.torissi.array;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}

/*
* 1. 항의 갯수 입력
* 2. 그 만큼의 피보나치 수열 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
146ms
2
정답입니다
27MB
161ms
3
정답입니다
27MB
146ms
4
정답입니다
27MB
148ms
5
정답입니다
27MB
133ms
* */