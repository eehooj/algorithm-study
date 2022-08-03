package com.github.torissi.graph;

import java.util.Scanner;

public class Subset {

    static int n;
    static int[] ch;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ch = new int[n + 1];

        recursion(1);
    }

    private static void recursion(int l) {
        if (l == n + 1) { // 종착점 - 부분집합의 경우 하나가 완성
            StringBuilder temp = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    temp.append(i).append(" ");
                }
            }

            if (temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            ch[l] = 1; // 사용한다
            recursion(l + 1);
            ch[l] = 0; // 사용하지 않는다
            recursion(l + 1);
        }
    }
}

/* DFS
* 1. 자연수 N 입력
* 2. 1 부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력
* */