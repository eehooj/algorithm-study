package com.github.torissi.array;

import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[2][num];
        char[] winner = new char[num];

        for (int i = 0; i < num; i++) {
            arr[0][i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            arr[1][i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            int a = arr[0][i];
            int b = arr[1][i];

            if (a == b) { // 비기면
                winner[i] = 'D';
            } else if (a - b == -1) {
                winner[i] = 'B';
            } else if (b - a == -1) {
                winner[i] = 'A';
            } else if (a - b == 2) {
                winner[i] = 'B';
            } else if (b - a == 2) {
                winner[i] = 'A';
            }
        }

        for (char a : winner) {
            System.out.println(a);
        }
    }
}

/*
* 1. A, B 가위바위보
* 2. 총 N번의 게임
* 3. A가 이기면 A 출력, B가 이기면 B 출력, 비기면 D 출력
* 4. 1은 가위, 2는 바위, 3은 보
* 5. 누가 이겼는지 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
168ms
2
정답입니다
27MB
157ms
3
정답입니다
27MB
172ms
4
정답입니다
27MB
174ms
5
정답입니다
27MB
142ms
* */