package com.github.torissi.graph;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(recursion(i) + " ");
        }
    }

    private static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }
}

/* 재귀함수
* 1. 자연수 N 입력
* 2. N! 구하기
* */