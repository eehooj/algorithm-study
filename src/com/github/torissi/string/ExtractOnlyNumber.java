package com.github.torissi.string;

import java.util.Scanner;

public class ExtractOnlyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(str));
    }
}

/*
* 1. 문자 + 숫자 문자열 입력
* 2. 숫자만 추출
* 3. 순서대로 자연수를 만듦
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
140ms
2
정답입니다
27MB
128ms
3
정답입니다
27MB
146ms
4
정답입니다
27MB
127ms
5
정답입니다
27MB
102ms
* */