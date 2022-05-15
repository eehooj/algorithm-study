package com.github.torissi.hash;

import java.util.*;

public class TypeOfSales_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sales = new int[n];
        Map<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
        }

        for (int i = 0; i < k - 1; i++) {
            count.put(sales[i], count.getOrDefault(sales[i], 0) + 1);
        }

        int lt = 0;

        for (int rt = k - 1; rt < n; rt++) {
            count.put(sales[rt], count.getOrDefault(sales[rt], 0) + 1);
            answer.add(count.size());
            count.put(sales[lt], count.get(sales[lt]) - 1);

            if (count.get(sales[lt]) == 0) {
                count.remove(sales[lt]);
            }

            lt++;
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}

/*
* 1. N일 동안의 매출 기록, 연속된 K일 동안의 매출액 입력
* 2. 구간별로 종류 구하고 출력
* */

/* 강사님 풀이
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