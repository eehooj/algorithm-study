package com.github.torissi.string;

import java.util.Scanner;

public class PalindromeA_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        String answer = "NO";

        String anObject = new StringBuilder(str).reverse().toString();
        if (str.equals(anObject)) {
            answer = "YES";
        }

        System.out.println(answer);
    }
}

/*
* 1. 문자열 입력
* 2. 회문 문자열이면 YES, 아니면 NO 출력
* 3. 대소문자 구분X, 문자열만 비교
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
163ms
2
정답입니다
27MB
141ms
3
정답입니다
27MB
150ms
4
정답입니다
27MB
157ms
5
정답입니다
27MB
124ms

* */