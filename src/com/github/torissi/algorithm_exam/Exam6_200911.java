package com.github.torissi.algorithm_exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam6_200911 {

    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i =1; i<=2*a; i++) {
            if (i % 2 == 0) {
                for (int j=1; j<=a; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j=1; j<=a; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }*/

        // 다른 사람
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 첫 번째 행
        for(int i = 0 ; i < N ; i++) {
            if(i%2 == 0) {
                sb.append('*');
            }
            else {
                sb.append(' ');
            }
        }
        sb.append('\n');

        // 두 번째 행
        for(int i = 0; i < N ; i++) {
            if(i%2!=0) {
                sb.append('*');
            }
            else {
                sb.append(' ');
            }
        }
        sb.append('\n');

        // sb 에 저장된 문자열을 String 변수에 저장
        String str = sb.toString();

        // sb 에 str 을 N-1 번 반복 저장
        for(int i = 1; i < N ; i++) {
            sb.append(str);
        }
        System.out.println(sb);
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/10996