package com.github.torissi.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int a = 0; a < num; a++) {
            arr[a] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        int prev = 0;

        for (int a : arr) {
            if (a > prev) {
                list.add(a);
            }

            prev = a;
        }

/*        list.add(arr[0]);

        for (int i = 1; i < num; i++) {
            if (arr[i - 1] < arr[i]) {
                list.add(arr[i]);
            }
        }*/

        list.forEach(item -> System.out.print(item + " "));
    }
}

/*
* 1.
* */

/*
ID	결과	Memory	Time
1
정답입니다
33MB
356ms
2
정답입니다
33MB
319ms
3
정답입니다
33MB
350ms
4
정답입니다
33MB
335ms
5
정답입니다
33MB
282ms
* */

/* 향상된 for
ID	결과	Memory	Time
1
정답입니다
32MB
334ms
2
정답입니다
33MB
322ms
3
정답입니다
33MB
340ms
4
정답입니다
33MB
342ms
5
정답입니다
33MB
275ms
* */