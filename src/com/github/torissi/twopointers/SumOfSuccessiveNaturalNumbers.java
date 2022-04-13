package com.github.torissi.twopointers;

import java.util.Scanner;

public class SumOfSuccessiveNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int answer = 0;
        int point = 1;

        for (int i = 1; i < n; i++) {
            sum += i;

            if (n == sum) {
                answer++;
            }

            while (sum >= n) {
                sum -= point;

                if (n == sum) {
                    answer++;
                }

                point++;
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. n개 입력
* 2. 2개 이상 연속된 자연수의 합으로 n을 표현하는 가짓수 출력
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
161ms
3
정답입니다
27MB
160ms
4
정답입니다
27MB
155ms
5
정답입니다
27MB
118ms
* */