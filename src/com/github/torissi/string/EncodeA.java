package com.github.torissi.string;

import java.util.Scanner;

public class EncodeA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String letter = scanner.next();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String temp = letter.substring(0, 7)
                    .replace('#', '1').replace('*', '0');

            int ten = Integer.parseInt(temp, 2);
            builder.append((char) ten);

            letter = letter.substring(7);
        }

        System.out.println(builder);
    }
}

/*
* 1. 알파벳 대문자로 구성된 비밀 편지
* 2. 알파벳 한 문자마다 # 또는 *이 일곱개로 구성
* 3. 이진수로 변경 -> # == 1, * == 0
* 4. 10진수화
* 5.아스키코드로 변환
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
154ms
3
정답입니다
27MB
145ms
4
정답입니다
27MB
152ms
5
정답입니다
27MB
116ms
* */