package com.github.torissi.algorithm_for;

import java.io.*;

public class For9_200907 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i=1; i<=a; i++) {
            for (int j=0; j<a-i; j++) {
                bw.write(" ");
            }
            for (int k=0; k<i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

//https://www.acmicpc.net/problem/2439