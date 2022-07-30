package com.github.torissi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Mischievous {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] answer = solution(n, arr);

        for (int item : answer) {
            System.out.print(item + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        int[] sorting = Arrays.copyOf(arr, n);
        int index = 0;

        Arrays.sort(sorting);

        for (int i = 0; i < n; i++) {
            if (arr[i] != sorting[i]) {
                answer[index] = i + 1;
                index++;
            }

            if (index > 1) {
                break;
            }
        }

        return answer;
    }

}

/*
* 1. N명의 학생들
* 2. 키가 작은 순서부터 일렬
* 3. 가장 앞부터 1번 ... N번
* 4. 철수는 앞번호가 받고 싶어서 짝꿍과 자리를 바꿈
* 5. 철수가 받은 번호와 철수 짝꿍이 받은 번호를 차례로 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
152ms
2
정답입니다
27MB
173ms
3
정답입니다
27MB
162ms
4
정답입니다
27MB
164ms
5
정답입니다
27MB
156ms
* */