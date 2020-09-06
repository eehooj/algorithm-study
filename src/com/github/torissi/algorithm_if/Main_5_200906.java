package com.github.torissi.algorithm_if;

import java.time.LocalTime;
import java.util.Scanner;

public class Main_5_200906 {
    //https://www.acmicpc.net/problem/2884

    //내가 한 방식
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        LocalTime wakeTime = LocalTime.of(a, b);

        LocalTime alarmTime = wakeTime.minusMinutes(45);

        System.out.print(alarmTime.getHour() + " " + alarmTime.getMinute());
    }

}
