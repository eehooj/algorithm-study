package com.github.torissi.algorithm_method;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] chk = new boolean[10000];

        for (int i=1; i<=10000; i++) {
            int n = d(i);
            if (n-1 < 10000) {
                chk[n-1] = true;
            }
        }

        for (int i=1; i<=10000; i++) {
            if (!chk[i-1]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static int d(int a) {
        int sum = a;

        while (a != 0) {
            sum += a%10;
            a /= 10;
        }

        return sum;
    }

}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/4673