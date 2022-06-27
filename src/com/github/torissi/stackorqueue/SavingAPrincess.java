package com.github.torissi.stackorqueue;

import java.util.*;

public class SavingAPrincess {

    public static int solution(int n, int k){
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }

            queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int solution = solution(n, k);

        System.out.println(solution);
    }
}

/*
* 1. 1번 부터 n번 까지 차례로 번호를 매김
* 2. 1번 부터 시계방향으로 돌아가며 번호를 외침
* 3. k를 외치면 공주를 구하는 것에서 제외
* 4. 마지막에 남은 사람이 공주를 구하러 감
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
143ms
2
정답입니다
27MB
148ms
3
정답입니다
27MB
157ms
4
정답입니다
27MB
152ms
5
정답입니다
27MB
184ms
* */