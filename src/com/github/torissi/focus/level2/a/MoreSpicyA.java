package com.github.torissi.focus.level2.a;

import java.util.PriorityQueue;

public class MoreSpicyA {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int count = 0;

        for (int item : scoville) {
            queue.offer(item);
        }

        while (queue.size() > 1 && queue.peek() < K) {
            int first = queue.poll();
            int second = queue.poll();
            int mix = first + (second * 2);

            queue.add(mix);
            count++;
        }

        if (!queue.isEmpty() && queue.peek() < K) {
            count = -1;
        }

        return count;
    }

    public static void main(String[] args) {
        MoreSpicyA f = new MoreSpicyA();
        int[] progresses = {1, 2, 3, 9, 10, 12};
        int k = 7;

        f.solution(progresses, k);
    }
}


/* 더 맵게
* 1. 스코빌 지수를 K이상으로 만들거임
* 2. 스코빌 지수가 가장 낮은 두 개의 음식을 특별한 방법으로 섞어 새로운 음식 만듦
* 3. k 이상 될 때 까지 반봅
* 4. 섞은 음식 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수  *  2);
* 5. 섞어야 하는 최소 횟수를 리턴
* */
