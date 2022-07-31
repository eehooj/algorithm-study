package com.github.torissi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(m, arr));
    }

    private static int solution(int m, int[] arr) {
        int answer = -1;
        int length = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < length; i++) {
            if (arr[i] == m) {
                answer = i + 1;

                break;
            }
        }

        return answer;
    }
}

/*
* 1. 임의의 N개 숫자 입력
* 2. 오름차순으로 정렬
* 3. M 숫자가 몇 번째에 있는지?
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
174ms
2
정답입니다
27MB
179ms
3
정답입니다
27MB
156ms
4
정답입니다
29MB
188ms
5
정답입니다
32MB
299ms
* */