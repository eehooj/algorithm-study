package com.github.torissi.algorithm_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String3_200914 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] out = new int[26];
        Arrays.fill(out, -1);
        /*char[] arr = {
                'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z'
        };

        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<arr.length; j++) {
                if (s.charAt(i) == arr[j]) {
                    if (out[j] == -1) {
                        out[j] = i;
                        break;
                    }
                }
            }
        }*/

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (out[ch - 'a'] == -1) {
                out[ch - 'a'] = i;
            }
        }

        for (int i=0; i<out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }
}

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 문제에서 입력이 한 줄로 나온다면 진짜 한 줄 입력을 해서 할 수 있도록 해야함
//나는 처음에 기존에 하던 방식 처럼 한 줄로 받아서 StringTokenizer로 띄어쓰기 기준으로 잘라서 써서 런타임 에러가 났음

//https://www.acmicpc.net/problem/10809