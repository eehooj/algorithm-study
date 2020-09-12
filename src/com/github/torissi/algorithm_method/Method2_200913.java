package com.github.torissi.algorithm_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method2_200913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = arithmethic(Integer.parseInt(br.readLine()));
        System.out.println(count);
    }

    public static int arithmethic(int a) {
        int count = 0;

        if (a < 100) {
            return a;
        } else {
            count = 99;
            if (a == 1000) {
                a = 999;
            }

            for (int i=100; i<=a; i++) {
                int hun = i/100;
                int ten = (i/10) % 10;
                int one = i%10;

                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
        }

        return count;
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/1065
//참고 블로그 : https://st-lab.tistory.com/54