package com.github.torissi.graph;

import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        recursion(n);
    }

    private static void recursion(int n) {
        if (n > 0) {
            recursion(n - 1);

            System.out.print(n + " ");
        }
    }
}

/* 재귀함수
* 1. 자연수 N 입력
* 2. 제귀함수를 사용하여 1부터 N까지 출력
* */