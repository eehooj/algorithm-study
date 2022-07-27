package com.github.torissi.sort;

import java.util.*;

public class CheckForDuplicationTeacher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        String answer = solution(n, arr);

        System.out.println(answer);
    }

    private static String solution(int n, int[] arr) {
        String answer = "U";
        int length = arr.length - 1;
        Arrays.sort(arr);

        for (int i = 0; i < length; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";

                break;
            }
        }

        return answer;
    }
}

/*
* 1. 학생들이 각각 좋아하는 수 하나씩 적음
* 2. N명의 학생들이 적어낸 숫자에 중복이 있으면 D 출력
* 3. 없으면 U 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
167ms
2
정답입니다
28MB
220ms
3
정답입니다
32MB
348ms
4
정답입니다
34MB
763ms
5
정답입니다
34MB
803ms
* */