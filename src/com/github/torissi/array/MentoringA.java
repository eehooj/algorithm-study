package com.github.torissi.array;

import java.util.Scanner;

public class MentoringA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 학생 수
        int m = scanner.nextInt(); // 테스트 수
        int[][] arr = new int[m][n];
        int answer = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) { //등수
            for (int j = 1; j <= n; j++ ) { // 등수
                int count = 0;

                for (int k = 0; k <m; k++) { // 테스트
                    int pi = 0;
                    int pj = 0;

                    for (int s = 0; s < n; s++) { // 학생
                        if (arr[k][s] == i) {
                            pi = s;
                        }

                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }

                    if (pi < pj) {
                        count++;
                    }
                }

                if (count == m) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. N명의 학생과 M번의 수학 테스트
* 2. 멘토는 멘티보다 M번의 수학테스트에서 모두 등수가 높아야함
* 3. 짝을 만들 수 있는 경우의 수 출력
* */
/*

* */