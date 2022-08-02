package com.github.torissi.graph;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(recursion(n));
    }

    private static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}

/* 재귀함수
* 1. 자연수 N 입력
* 2. N! 구하기
* */