package com.github.torissi.focus.level2.a;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterA {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int length = priorities.length - 1;

        for (int item : priorities) {
            queue.offer(item);
        }

        Arrays.sort(priorities);

        while (!queue.isEmpty()) {
            int item = queue.poll();

            if (item == priorities[length - answer]) {
                answer++;
                location--;

                if (location < 0) {
                    break;
                }
            } else {
                queue.add(item);
                location--;

                if (location < 0) {
                    location = queue.size() - 1;
                }
            }
        }

        return answer;
    }
}

/* 프린터
* 1. 중요도가 높은 문서를 먼저 인쇄
* 2. 인쇄 대기 목록의 가장 앞에 있는 문서(J)를 대기 목록에서 꺼냄
* 3. 나머지 인쇄 대기 목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록 맨 뒤로
* 4. 그렇지 않으면 J를 인쇄
* 5. 인쇄를 요청한 문서가 몇 번째로 인지 리턴
* */