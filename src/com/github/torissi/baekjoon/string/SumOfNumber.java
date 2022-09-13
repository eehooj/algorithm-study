package com.github.torissi.baekjoon.string;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = scanner.next().split("");
        int sum = 0;

        for (String item : str) {
            sum += Integer.parseInt(item);
        }

        System.out.println(sum);
    }
}
