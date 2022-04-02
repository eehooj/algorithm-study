package com.github.torissi.string;

import java.util.Scanner;

public class EliminateDuplicateCharactersA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder answer = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer.append(str.charAt(i));
            }
        }

        System.out.println(answer.toString());
    }
}

/*
* 1. 소문자 문자열 입력
* 2. 중복 문자열 제거
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
149ms
2
정답입니다
27MB
131ms
3
정답입니다
27MB
139ms
4
정답입니다
27MB
148ms
5
정답입니다
27MB
116ms

* */

/*
* indexOf() -> 제일 처음에 발견된 문자의 인덱스를 리턴
* */