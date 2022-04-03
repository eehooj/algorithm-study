package com.github.torissi.string;

import java.util.Locale;
import java.util.Scanner;

public class CircularString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*StringBuilder builder = new StringBuilder(scanner.next().toUpperCase());

        if (builder.toString().equals(builder.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/

        String str = scanner.next().toUpperCase();
        int length = str.length();
        String answer = "YES";

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                answer = "NO";
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. 문자열 입력
* 2. 회문 문자열이면 YES, 아니면 NO 출력
* 3. 대소문자 구분X
* */

/* reverse
ID	결과	Memory	Time
1
정답입니다
27MB
149ms
2
정답입니다
27MB
145ms
3
정답입니다
27MB
144ms
4
정답입니다
27MB
144ms
5
정답입니다
27MB
122ms
* */

/* charAt
ID	결과	Memory	Time
1
정답입니다
27MB
128ms
2
정답입니다
27MB
141ms
3
정답입니다
27MB
149ms
4
정답입니다
27MB
144ms
5
정답입니다
27MB
113ms
* */