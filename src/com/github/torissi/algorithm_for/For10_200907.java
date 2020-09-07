package com.github.torissi.algorithm_for;

import java.io.*;
import java.util.StringTokenizer;

public class For10_200907 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int key = Integer.parseInt(st.nextToken());

        StringTokenizer num = new StringTokenizer(br.readLine());
        for (int i=0; i<a; i++) {
            int b = Integer.parseInt(num.nextToken());

            if (b < key) {
                bw.write(b + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

//https://www.acmicpc.net/problem/10871