package com.github.torissi.algorithm_for;

import java.util.Scanner;

public class For1_200906 {
    //https://www.acmicpc.net/problem/2739

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        for(int i=1; i<10; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }

    }
}
