package com.github.torissi.algorithm_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        int[] arr = new int[26];
        int max = 0;
        int index = 0;

        for (int i=0; i<s.length(); i++) {
            int num = s.charAt(i) - 'a';
            arr[num]++;
        }

        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            } else if (max == arr[i]) {
                index = -1;
            }
        }

        String out =
                index == -1 ? "?" : String.valueOf((char)(index+'a')).toUpperCase();

        System.out.println(out);
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/1157