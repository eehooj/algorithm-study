package com.github.torissi.algorithm_if;

import java.util.Scanner;

public class Main4_200906 {

    //내가 한 방식
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }*/

    // 다른 풀이
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < 0) {
            if (b < 0) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        } else {
            if (b < 0) {
                System.out.println(4);
            } else {
                System.out.println(1);
            }
        }
    }
}
