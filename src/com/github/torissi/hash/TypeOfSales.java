package com.github.torissi.hash;

import java.util.*;

public class TypeOfSales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
        }

        int i = 0;
        int j = k;
        Map<Integer, Set<Integer>> count = new HashMap<>();

        while (j <= n) {
            count.put(i, new HashSet<>());

            for (int l = i; l < j; l++) {
                count.get(i).add(sales[l]);
            }

            i++;
            j++;
        }

        int size = count.size();

        for (int l = 0; l < size; l++) {
            System.out.print(count.get(l).size() + " ");
        }
    }
}

/*
* 1. N일 동안의 매출 기록, 연속된 K일 동안의 매출액 입력
* 2. 구간별로 종류 구하고 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
153ms
2
정답입니다
27MB
174ms
3
Time Limit Exceeded
148MB
1896ms
4
Time Limit Exceeded
96MB
1880ms
5
Time Limit Exceeded
97MB
1922ms
* */