package com.github.inflearn.array;

import java.util.*;

public class Ranking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        List<Integer> rank = new ArrayList<>();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int item = scanner.nextInt();
            arr.add(item);
            rank.add(item);
        }

        rank.sort(Comparator.reverseOrder());

        int prev = -1;
        int preIndex = -1;

        for (int i = 0; i < n; i++) {
            int temp = rank.get(i);
            int index = arr.indexOf(temp);

            if (temp == prev) {
                answer[index] = answer[preIndex];
            } else {
                answer[index] = i + 1;
                prev = temp;
                preIndex = index;
            }


            arr.set(index, 0);
        }

        for (int item : answer) {
            System.out.print(item + " ");
        }
    }
}

/* 등수 구하기
1. N명의 학생의 국어 점수 입력
2. 등수를 입력된 순서대로 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
160ms
2
정답입니다
27MB
173ms
3
정답입니다
27MB
167ms
4
정답입니다
27MB
181ms
5
정답입니다
27MB
164ms

* */