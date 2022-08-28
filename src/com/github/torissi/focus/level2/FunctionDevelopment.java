package com.github.torissi.focus.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int length = progresses.length;

        for (int i = 0; i < length; i++) {
            int speed = speeds[i];
            int extraWork = 100 - progresses[i];
            int day = 0;

            while (extraWork > 0) {
                extraWork -= speed;
                day++;
            }

            que.offer(day);
        }

        int first = que.poll();
        int count = 1;

        while (!que.isEmpty()) {
            Integer temp = que.poll();

            if (first >= temp) {
                count++;
            } else {
                list.add(count);
                first = temp;
                count = 1;
            }
        }

        list.add(count);

        int size = list.size();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        FunctionDevelopment f = new FunctionDevelopment();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        f.solution(progresses, speeds);
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

/* 기능 개발
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