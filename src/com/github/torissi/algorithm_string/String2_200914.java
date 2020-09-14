package com.github.torissi.algorithm_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2_200914 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int sum = 0;
        
        for(byte c : b.getBytes()) {
            sum += c - '0'; //입력한 문자 그대로 출력하기 위해 0을 뺴줌
        }
        
        //내가 푼 방식
        /*
        for (int i=0; i<a; i++) {
            int c = Integer.parseInt(String.valueOf(b.charAt(i)));
            sum += c;
        }*/

        System.out.println(sum);
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/11720