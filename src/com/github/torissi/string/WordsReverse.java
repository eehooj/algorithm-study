package com.github.torissi.string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordsReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int a = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < a; i++) {
            StringBuilder str = new StringBuilder(scanner.nextLine());

            System.out.println(str.reverse());
        }*/

        int a = scanner.nextInt();
        String[] arr = new String[a];

        for (int i = 0; i < a; i++) {
            arr[i] = scanner.next();
        }

        ArrayList<String> answer = new ArrayList<>();

        for (String x : arr) {
            char[] b = x.toCharArray();

            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {
                char tmp = b[lt];
                b[lt] = b[rt];
                b[rt] = tmp;

                lt++;
                rt--;
            }

            String tmp = String.valueOf(b);

            answer.add(tmp);
        }

        answer.forEach(System.out::println);
    }
}

/*
* 1. 여러 단어 입력
* 2. 단어들 뒤집어 출력
* */

/* StringBuilder
ID	결과	Memory	Time
1
정답입니다
27MB
140ms
2
정답입니다
27MB
145ms
3
정답입니다
27MB
150ms
4
정답입니다
27MB
146ms
5
정답입니다
27MB
121ms
* */

/*
ID	결과	Memory	Time
1
정답입니다
33MB
337ms
2
정답입니다
33MB
330ms
3
정답입니다
33MB
330ms
4
정답입니다
33MB
343ms
5
정답입니다
33MB
296ms
* */