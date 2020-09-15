package com.github.torissi.algorithm_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String8_200915 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    count+= 3;
                    break;

                case 'D' : case 'E' : case 'F' :
                    count+= 4;
                    break;

                case 'G' : case 'H' : case 'I' :
                    count+= 5;
                    break;

                case 'J' : case 'K' : case 'L' :
                    count+= 6;
                    break;

                case 'M' : case 'N' : case 'O' :
                    count+= 7;
                    break;

                case 'P' : case 'Q' : case 'R' : case 'S' :
                    count+= 8;
                    break;

                case 'T' : case 'U' : case 'V' :
                    count+= 9;
                    break;

                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    count+= 10;
                    break;
            }
        }
        System.out.println(count);
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/5622