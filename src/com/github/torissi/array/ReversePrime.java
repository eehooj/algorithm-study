package com.github.torissi.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] arr = new String[num];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.next();
        }

        for (String a : arr) {
            StringBuilder builder = new StringBuilder(a);
            int temp = Integer.parseInt(builder.reverse().toString());
            boolean isPrime = true;

            for (int i = 2; i < Math.sqrt(100001); i++) {
                if (temp != i) {
                    if (temp == 1  || temp % i == 0 ) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                list.add(temp);
            }
        }

        list.forEach(item -> System.out.print(item + " "));
    }
}

/*
* 1. 자연수 입력
* 2. 각 자연수를 뒤집고, 그 수가 소수면 출력
* 3. 각 자연수의 크기는 100,000를 넘지 않는다.
* */

/*
ID	결과	Memory	Time
1
정답입니다
33MB
292ms
2
정답입니다
33MB
331ms
3
정답입니다
33MB
319ms
4
정답입니다
33MB
361ms
5
정답입니다
33MB
295ms
* */