package com.github.torissi.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(scanner.nextLine());

        int length = 0;
        String answer = "";

        while (st.hasMoreTokens()) {
            String str = st.nextToken();

            if (str.length() > length) {
                length = str.length();
                answer = str;
            }
        }

        /*String[] str = scanner.nextLine().split(" ");

        int length = 0;
        String answer = "";

        for (String a : str) {
            if (a.length() > length) {
                length = a.length();
                answer = a;
            }
        }*/

        System.out.println(answer);
    }
}

/*
* 1. 문장 입력
* 2. 가장 긴 단어 출력 (공백으로 구분)
* */

/*  StringTokenizer
ID	결과	Memory	Time
1
정답입니다
27MB
133ms
2
정답입니다
27MB
152ms
3
정답입니다
27MB
128ms
4
정답입니다
27MB
128ms
5
정답입니다
27MB
122ms
* */

/* split
ID	결과	Memory	Time
1
정답입니다
27MB
150ms
2
정답입니다
27MB
151ms
3
정답입니다
27MB
169ms
4
정답입니다
27MB
149ms
5
정답입니다
27MB
147ms
* */