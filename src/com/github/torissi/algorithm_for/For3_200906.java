package com.github.torissi.algorithm_for;

import java.util.Scanner;

public class For3_200906 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int sum = 0;

        for (int i=0; i<=a; i++) {
            sum+=i;
        }

        System.out.println(sum);
    }
}


//https://www.acmicpc.net/problem/10950