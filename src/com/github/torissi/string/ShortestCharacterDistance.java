package com.github.torissi.string;

import java.util.Scanner;

public class ShortestCharacterDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char t = scanner.next().charAt(0);

        char[] cha = next.toCharArray();
        int length = cha.length;
        int[] out = new int[length];
        int temp = next.indexOf(t);

        for (int i = 0; i < length; i++) {
            if (cha[i] == t) {
                out[i] = 0;
                temp = i;
            } else {
                out[i] = Math.abs(i - temp);
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (cha[i] == t) {
                temp = i;
            } else {
                out[i] = Math.min(out[i], Math.abs(i - temp));
            }
        }

        for (int i : out) {
            System.out.print(i + " ");
        }
    }
}

/*
* 1. 문자열 S와 문자 T 입력
* 2. 문자열 S의 각 문자들과 문자 T의 최소거리 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
155ms
2
정답입니다
27MB
140ms
3
정답입니다
27MB
148ms
4
정답입니다
27MB
140ms
5
정답입니다
27MB
122ms
* */