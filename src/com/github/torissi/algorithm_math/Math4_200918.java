package com.github.torissi.algorithm_math;

import java.io.*;

public class Math4_200918 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int prev_count_sum = 0;

        while (true) {
            if (a <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {
                    bw.write((cross_count - (a - prev_count_sum -1)) +"/" + (a - prev_count_sum));
                    break;
                } else {
                    bw.write((a - prev_count_sum) + "/" + (cross_count - (a - prev_count_sum -1)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/1193