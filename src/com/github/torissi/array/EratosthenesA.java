package com.github.torissi.array;

import java.util.Scanner;

public class EratosthenesA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean[] prime = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            prime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) { // 작은 값들을 구하면 큰 값도 구할 수 있기 때문에 속도, 메모리를 위해 제곱근으로...
            for (int j = i + i; j <= num; j += i) { // i의 배수인 것들은 소수가 아님
                prime[j] = false;
            }
        }

        int answer = 0;

        for (boolean a : prime) {
            if (a) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}

/*
* 1. 자연수 입력
* 2. 1 부터 그 자연수까지의 소수의 개수를 출력
* */

/*
* 에레토스체네스 체
* - 소수가 되는 수의 배수를 지우면 남는 것은 소수가 된다
* - 2 부터 자기 자신을 제외한 배수가 되는 것을 자우면 된다
* */

/*
ID	결과	Memory	Time
1	
정답입니다
27MB
147ms
2	
정답입니다
27MB
164ms
3	
정답입니다
27MB
141ms
* */