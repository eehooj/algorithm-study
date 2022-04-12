package com.github.torissi.twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombiningArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        int m = scanner.nextInt();

        for(int i = 0; i < m; i++){
            list.add(scanner.nextInt());
        }

        list.sort(null);

        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}

/*
* 1. n개 입력
* 2. n개의 배열 숫자들 입력
* 3. m개 입력
* 4. m개의 배열 숫자들 입력
* 5.
* */
/*
ID	결과	Memory	Time
1
정답입니다
27MB
134ms
2
정답입니다
27MB
165ms
3
정답입니다
27MB
143ms
4
정답입니다
27MB
177ms
5
정답입니다
27MB
160ms

* */