package com.github.torissi.string;

import java.util.Scanner;

public class FindCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] str = scanner.next().toCharArray();

        StringBuilder answer = new StringBuilder();

        for (char a : str) {
            if (Character.isUpperCase(a)) {
                answer.append(Character.toLowerCase(a));
            } else {
                answer.append(Character.toUpperCase(a));
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. 문자 입력 받고
* 2. 대문자는 소문자로, 소문자는 대문자로 변환
* */

/* +=
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

/* StringBuilder
 *ID	결과	Memory	Time
1
정답입니다
27MB
136ms
2
정답입니다
27MB
143ms
3
정답입니다
27MB
156ms
4
정답입니다
27MB
145ms
5
정답입니다
27MB
127ms
* */