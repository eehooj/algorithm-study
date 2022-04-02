package com.github.torissi.string;

import java.util.Scanner;

public class ParticularWordsReverseA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.next().toCharArray();
        int length = str.length;
        int lt = 0;
        int rt = length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(str[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(str[rt])) {
                rt--;
            } else {
                char tmp = str[lt];
                str[lt] = str[rt];
                str[rt] = tmp;

                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(str));
    }
}

/*
* 1. 알파벳 + 특문 문자열 입력
* 2. 알파벳만 뒤집기
* 3. 특문은 그대로
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
128ms
2
정답입니다
27MB
153ms
3
정답입니다
27MB
152ms
4
정답입니다
27MB
141ms
5
정답입니다
27MB
119ms
* */