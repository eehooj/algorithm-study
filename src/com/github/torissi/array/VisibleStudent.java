package com.github.torissi.array;

import java.util.Scanner;

public class VisibleStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        int answer = 0;

        for (int height : arr) {
            if (height > max) {
                answer++;

                max = height;
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. 학생들 일렬로 주어짐
* 2. 보이는 학생 수 구하기
* 3. 앞에 서 있는 사람들보다 크면 보임, 작거나 같으면 안보임
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
145ms
2
정답입니다
27MB
185ms
3
정답입니다
29MB
199ms
4
정답입니다
32MB
284ms
5
정답입니다
34MB
774ms
* */