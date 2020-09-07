package com.github.torissi.algorithm_while;

import java.io.*;
import java.util.StringTokenizer;

public class While2_200907 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        StringTokenizer st;

        while((str = br.readLine()) != null && str.length() != 0) {
            st = new StringTokenizer(str);
            String a = st.nextToken();
            String b = st.nextToken();

            bw.write(Integer.parseInt(a) +Integer.parseInt(b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

//https://www.acmicpc.net/problem/10951