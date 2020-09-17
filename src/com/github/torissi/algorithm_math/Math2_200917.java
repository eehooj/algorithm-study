package com.github.torissi.algorithm_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math2_200917 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a == 4 || a == 7) {
            System.out.println(-1);
        } else if (a % 5 == 0) {
            System.out.println(a / 5);
        } else if (a % 5 == 1 || a % 5 ==3) {
            System.out.println((a / 5) + 1);
        } else if (a % 5 == 2 || a % 5 == 4) {
            System.out.println((a / 5) + 2);
        }
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/2839