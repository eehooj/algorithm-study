package com.github.torissi.algorithm_while;

import java.io.*;

public class While3_200907 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int b = Integer.parseInt(br.readLine());
        int cnt = 0;
        int temp = 0;
        int c = b / 10;
        int d = b % 10;

        while (true) {
            cnt++;
            temp = d;
            d = (c + d) % 10;
            c = temp;
            if (b == c*10+d) break;
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

//https://www.acmicpc.net/problem/1110