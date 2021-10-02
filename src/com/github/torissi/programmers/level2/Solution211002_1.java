package com.github.torissi.programmers.level2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution211002_1 {

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

    public static void main(String[] args) {
    }
}

/* 기능개발
문제 설명
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

제한 사항
작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
작업 진도는 100 미만의 자연수입니다.
작업 속도는 100 이하의 자연수입니다.
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
입출력 예
progresses	speeds	return
[93, 30, 55]	[1, 30, 5]	[2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
입출력 예 설명
입출력 예 #1
첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.

따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.

입출력 예 #2
모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다. 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.

따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.

※ 공지 - 2020년 7월 14일 테스트케이스가 추가되었습니다.
*/

/*
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
테스트 11 〉	통과 (0.14ms, 70.2MB)
*/
