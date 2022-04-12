package com.github.torissi.slidingwindow;

import java.util.Scanner;

public class HighestSalesA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}

/*
* 1. N일, K일 입력
* 2. N일 동안의 연속된 K일 동안 최대 매출 출력
* */
/*
ID	결과	Memory	Time
1
정답입니다
27MB
149ms
2
정답입니다
27MB
136ms
3
정답입니다
32MB
313ms
4
정답입니다
33MB
571ms
5
정답입니다
34MB
734ms
* */