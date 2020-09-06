package com.github.torissi.algorithm_for;

import java.io.*;

public class For5_200906 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        /*for (int i=1; i<=a; i++) {
            bw.write(i + "\n");
        }*/

        for (int i=a; i>=1; i--) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

//https://www.acmicpc.net/problem/2741
//https://www.acmicpc.net/problem/2742