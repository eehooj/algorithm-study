package com.github.torissi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort_Arrays {

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
        Arrays.sort(arr); // 퀵정렬을 사용함

        return arr;
    }
}


/*
* 1. N개의 숫자 입력
* 2. 오름차순으로 정렬한 수열 출력
* */

/*
* ID	결과	Memory	Time
ID	결과	Memory	Time
1
정답입니다
27MB
157ms
2
정답입니다
27MB
133ms
3
정답입니다
27MB
148ms
4
정답입니다
27MB
167ms
5
정답입니다
27MB
117ms
* */