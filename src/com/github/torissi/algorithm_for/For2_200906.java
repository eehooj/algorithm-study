package com.github.torissi.algorithm_for;

import java.util.Scanner;

public class For2_200906 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        for(int i=0; i<a; i++) {
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(b + c);
        }

    }
}


//https://www.acmicpc.net/problem/10950