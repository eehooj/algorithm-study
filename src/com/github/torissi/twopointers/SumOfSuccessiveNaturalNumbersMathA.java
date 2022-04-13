package com.github.torissi.twopointers;

import java.util.Scanner;

public class SumOfSuccessiveNaturalNumbersMathA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1; // 연속 숫자 개수
        int answer = 0;

        n--;

        while (n > 0) {
            count++;
            n = n - count;

            if (n % count == 0) {
                answer++;
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
173ms
2
정답입니다
27MB
171ms
3
정답입니다
27MB
156ms
4
정답입니다
27MB
167ms
5
정답입니다
27MB
131ms
* */