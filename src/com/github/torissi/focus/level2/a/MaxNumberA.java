package com.github.torissi.focus.level2.a;

import java.util.*;

public class MaxNumberA {

    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int item : numbers){
            list.add(String.valueOf(item));
        }

        list.sort((a, b) -> (b + a).compareTo(a + b));

        for (String item : list) {
            answer.append(item);
        }

        return answer.toString().startsWith("0") ? "0" : answer.toString();
    }
}

/*
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int day = 0;

        for (int a : progresses) {
            queue.offer(a);
        }

        for (int a : speeds) {
            queue2.offer(a);
        }

        while (!queue.isEmpty()) {
            int num = 0;
            while (queue.peek() + (queue2.peek() * day) < 100) {
                day++;
            }

            while (!queue.isEmpty() && queue.peek() + (queue2.peek() * day) >= 100) {
                queue.poll();
                queue2.poll();
                num++;
            }

            list.add(num);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.17ms, 83.9MB)
테스트 2 〉	통과 (0.26ms, 74MB)
테스트 3 〉	통과 (0.23ms, 75.6MB)
테스트 4 〉	통과 (0.29ms, 71.7MB)
테스트 5 〉	통과 (0.13ms, 72.3MB)
테스트 6 〉	통과 (0.15ms, 76.3MB)
테스트 7 〉	통과 (0.26ms, 71.1MB)
테스트 8 〉	통과 (0.24ms, 75.4MB)
테스트 9 〉	통과 (0.21ms, 77.8MB)
테스트 10 〉	통과 (0.21ms, 74.5MB)
테스트 11 〉	통과 (0.18ms, 79.6MB)
* */

/* 가장 큰 수
* 1.
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.19ms, 71.3MB)
테스트 2 〉	통과 (0.19ms, 72.6MB)
테스트 3 〉	통과 (0.25ms, 76.3MB)
테스트 4 〉	통과 (0.20ms, 77MB)
테스트 5 〉	통과 (0.14ms, 83MB)
테스트 6 〉	통과 (0.18ms, 70.4MB)
테스트 7 〉	통과 (0.23ms, 76.8MB)
테스트 8 〉	통과 (0.21ms, 77.8MB)
테스트 9 〉	통과 (0.18ms, 68.4MB)
테스트 10 〉	통과 (0.28ms, 70.1MB)
테스트 11 〉	통과 (0.13ms, 76.6MB)
* */