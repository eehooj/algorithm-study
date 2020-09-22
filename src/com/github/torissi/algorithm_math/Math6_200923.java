package com.github.torissi.algorithm_math;

import java.io.*;
import java.util.StringTokenizer;

public class Math6_200923 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i=0; i<a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); //층
            int w = Integer.parseInt(st.nextToken()); //방 수
            int n = Integer.parseInt(st.nextToken()); //몇 번째

            if (n % h == 0) {
                bw.write((h * 100) + (n / h) + "\n");
            } else {
                bw.write(((n % h) * 100) + ((n / h) + 1) + "\n");
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

//https://www.acmicpc.net/problem/10250