package com.github.torissi.string;

import java.util.Scanner;

public class ChangeCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] str = scanner.next().toUpperCase().toCharArray();
        char c = scanner.next().toUpperCase().charAt(0);

        int count = 0;

        for (char a : str) {
            if (a == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}

/*
* 1. 문자열 한줄 입력, 문자 하나(c) 입력
* 2. 케이스에 상관없이 같은 c와 같은 문자가 있는지 갯수 세기
* */

/*
* ID	결과	Memory	Time
1
정답입니다
27MB
154ms
2
정답입니다
27MB
144ms
3
정답입니다
27MB
152ms
4
정답입니다
27MB
126ms
5
정답입니다
27MB
131ms
*
* */