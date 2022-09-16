package com.github.inflearn.array;

import java.util.Scanner;

public class EratosthenesA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (arr[i] == 0) {
                continue;
            }

            for (int j = i + i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int item : arr) {
            if (item != 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
