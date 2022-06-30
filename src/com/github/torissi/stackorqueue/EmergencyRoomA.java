package com.github.torissi.stackorqueue;

import java.util.*;

public class EmergencyRoomA {

    private static class Emergency {
        int num;
        int priority;

        public Emergency(int num, int priority) {
            this.num = num;
            this.priority = priority;
        }

        public int getNum() {
            return num;
        }

        public int getPriority() {
            return priority;
        }
    }

    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Emergency> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Emergency(i, arr[i]));
        }

        boolean isCheck = true;

        while (!queue.isEmpty()) {
            Emergency temp = queue.poll();

            for (Emergency item : queue) {
                if (temp.priority < item.priority) {
                    queue.offer(temp);

                    isCheck = false;

                    break;
                } else {
                    isCheck = true;
                }
            }

            if (isCheck) {
                answer++;

                if (temp.getNum() == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++ ) {
            arr[i] = scanner.nextInt();
        }

        int solution = solution(n, m, arr);

        System.out.println(solution);
    }
}

/*
* 1. 환자가 도착한 순서대로 진료
* 2. 위험도가 높은 환자는 빨리 진료
* 3. 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기 목록 제일 뒤로 보냄
* 4. N명의 대기 목록 상의 M번째 환자는 몇 번째로 진료 받는지 리턴
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
154ms
2
정답입니다
27MB
142ms
3
정답입니다
27MB
158ms
4
정답입니다
27MB
178ms
5
정답입니다
27MB
133ms

* */