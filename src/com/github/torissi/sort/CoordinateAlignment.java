package com.github.torissi.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoordinateAlignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        List<int[]> answer = solution(n, arr);

        for (int[] item : answer) {
            System.out.println(item[0] + " " + item[1]);
        }
    }

    private static List<int[]> solution(int n, int[][] arr) {
        return Arrays.stream(arr).sorted((o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] < o2[0]) {
                return -1;
            } else {
                if (o1[1] > o2[1]) {
                    return 1;
                } else if (o1[1] < o2[1]) {
                    return -1;
                }
            }

            return 0;
        }).collect(Collectors.toList());
    }

}

/*
* 1. N개의 좌표(X, Y)
* 2. 모든 좌표를 오름차순으로 정렬
* 3. X의 값으로 정렬 후 X가 같으면 Y 값으로 정렬
* */

/*
ID	결과	Memory	Time
1
정답입니다
33MB
372ms
2
정답입니다
34MB
541ms
* */