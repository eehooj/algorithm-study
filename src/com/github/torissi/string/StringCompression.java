package com.github.torissi.string;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] cha = scanner.nextLine().toCharArray();
        int length = cha.length;
        StringBuilder builder = new StringBuilder();
        int repeat = 1;
        char a = cha[0];

        for (int i = 1; i < length; i++) {
            if (cha[i - 1] == cha[i]) {
                repeat++;
            } else {
                builder.append(a);

                if (repeat > 1) {
                    builder.append(repeat);
                }
                repeat = 1;
                a = cha[i];
            }

            if (i == length - 1) {
                builder.append(a);

                if (repeat > 1) {
                    builder.append(repeat);
                }
            }
        }

        System.out.println(builder.toString());
    }
}

/*
* 1. 문자열 입력
* 2. 같은 문자가 반복될 경우 
* 3. 문자 오른쪽에 몇 번 반복되는지 횟수 표기
* 4. 반복횟수가 1이면 생략
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
143ms
2
정답입니다
27MB
137ms
3
정답입니다
27MB
136ms
4
정답입니다
27MB
147ms
5
정답입니다
27MB
118ms
* */