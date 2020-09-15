package com.github.torissi.algorithm_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String10_200915 {

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<a; i++) {
            if (check(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check(String s) throws IOException {
        boolean[] chk = new boolean[26];
        int prev = 0;

        for (int i=0; i<s.length(); i++) {
            int now = s.charAt(i);

            if (prev != now) {
                if (!chk[now - 'a']) {
                    chk[now - 'a'] = true;
                    prev = now;
                }
            } else {
                return false;
            }
        }
        return true;
    }*/

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/1316
//이해 못함