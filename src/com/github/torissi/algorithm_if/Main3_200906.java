package com.github.torissi.algorithm_if;

import java.util.Scanner;

public class Main3_200906 {

    //내가 한 방식
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        boolean isLunaday = isLunaday(a);

        if (isLunaday) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static boolean isLunaday(int a) {
        boolean isLuna = false;

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            isLuna = true;
        }

        return isLuna;
    }*/

    //검색해서 본 방식
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a % 4 == 0) {
            if (a % 100 != 0) {
                System.out.println("1");
            } else if (a % 400 == 0){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
