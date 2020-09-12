package com.github.torissi.algorithm_1array;

import java.io.*;
import java.util.StringTokenizer;

public class OneArray7_200912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr;

        for (int i=0; i <test; i++) {
            st = new StringTokenizer(br.readLine());
            double sum = 0;
            double count = 0;
            double avg = 0;

            int student = Integer.parseInt(st.nextToken());
            arr = new int[student];

            for (int j=0; j<arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum +=arr[j];
            }

            avg = sum/student;

            for (int j=0; j<arr.length; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }

            bw.write(String.format("%.3f", (count/student)*100) + "%" + "\n");
        }

        bw.flush();
        bw.close();
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/4344