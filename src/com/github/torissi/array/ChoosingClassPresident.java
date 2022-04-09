package com.github.torissi.array;

import java.util.Scanner;

public class ChoosingClassPresident {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num][5];
        int answer = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++ ) {
                arr[i][j] = scanner.nextInt();
            }
        }


    }
}

/*
* 1. 1학년 부터 5학년까지 지내오면서 한 번이라도 같은 반이었던 사람이 가장 많은 학생을 임시반장으로 선출
* */
/*
ID	결과	Memory	Time
1
정답입니다
27MB
142ms
2
정답입니다
27MB
151ms
3
정답입니다
27MB
146ms
4
정답입니다
29MB
198ms
5
정답입니다
32MB
255ms

* */