package com.github.torissi.string;

import java.util.Scanner;

public class FindCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] str = scanner.next().toCharArray();

        String answer = "";

        for (char a : str) {
            if (Character.isUpperCase(a)) {
                answer += Character.toLowerCase(a);
            } else {
                answer += Character.toUpperCase(a);
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. 문자 입력 받고
* 2. 대문자는 소문자로, 소문자는 대문자로 변환
* */

/*
*ID	결과	Memory	Time
1
정답입니다
27MB
153ms
2
정답입니다
27MB
160ms
3
정답입니다
27MB
148ms
4
정답입니다
27MB
143ms
5
정답입니다
27MB
113ms
* */