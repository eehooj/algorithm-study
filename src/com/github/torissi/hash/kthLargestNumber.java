package com.github.torissi.hash;

import java.util.*;

public class kthLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        list.sort(Collections.reverseOrder());

        int max = list.get(0) + list.get(1) + list.get(2);
        int answer = -1;

        if (n != 3) {
            int count = 0;

            for (int i = 3; i < n; i++) {
                count++;

                if (count == k) {
                    answer = max;

                    break;
                } else if (count > k) {
                    break;
                }else {
                    max = max - list.get(i - 1) + list.get(i);
                }
            }
        }

        System.out.println(answer);
    }

}

/*
* 1. 1부터 100까지 적힌 N장의 카드를 가지고 있음 (같은 숫자가 여러 장 있을 수 있음)
* 2. 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록할 예정
* 3. 3장을 뽑을 수 있는 모든 경우를 기록
* 4. 기록 중 K번째로 큰 수를 출력
* */