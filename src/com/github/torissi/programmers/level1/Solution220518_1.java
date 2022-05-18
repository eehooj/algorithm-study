package com.github.torissi.programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution220518_1 {

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int players = stages.length; // 플레이어 수
        int[] currentStage = new int[N + 1]; // 현재 스테이지에 머물러 있는 사람 수 넣을 배열
        Map<Integer, Double> map = new HashMap<>(); // <번호, 실패율>

        for (int item : stages) { // 현재 머물러 있는 스테이지 배열에 ++
            if (item <= N) {
                currentStage[item] += 1;
            }
        }

        for (int i = 1; i <= N; i++) { // 실패율 계산하여 map에 put
            double fail = 0.0;

            if (players > 0) { // 남은 플레이어가 0 보다 크면
                fail = (double) currentStage[i] / players; // 실패율 계산
                players -= currentStage[i]; // 남은 플레이어 계산
            }

            map.put(i, fail);
        }

        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(map.entrySet());

        entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue())); // 내림차순 정렬

        int index = 0;

        for (Map.Entry<Integer, Double> entry : entries) {
            answer[index] = entry.getKey();
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        //int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        //solution(5, stages);
        int[] stages = {4, 4, 4, 4, 4};
        solution(4, stages);
        /*int[] stages = {1, 1, 1};
        solution(3, stages);*/
    }
}

/* 실패율
1. 실패율 공식 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
2. 전체 스테이지 갯수 N,  현재 멈춰있는 스테이지 stages 입력
3. 실패율이 높은 스테이지 부터 내림차순 배열 리턴
4. 실패율이 같으면 작은 번호의 스테이지가 먼저
5. 스테이지에 도달한 유저가 없는 경우 그 스테이지의 실패율은 0
*/

/*
테스트 1 〉	통과 (0.60ms, 73.9MB)
테스트 2 〉	통과 (0.63ms, 73.5MB)
테스트 3 〉	통과 (2.44ms, 80MB)
테스트 4 〉	통과 (3.60ms, 82.9MB)
테스트 5 〉	통과 (6.96ms, 97.8MB)
테스트 6 〉	통과 (1.50ms, 78.4MB)
테스트 7 〉	통과 (1.21ms, 76.9MB)
테스트 8 〉	통과 (4.32ms, 77MB)
테스트 9 〉	통과 (5.05ms, 83.1MB)
테스트 10 〉	통과 (3.09ms, 80MB)
테스트 11 〉	통과 (3.97ms, 88.8MB)
테스트 12 〉	통과 (4.38ms, 80.3MB)
테스트 13 〉	통과 (5.39ms, 104MB)
테스트 14 〉	통과 (0.70ms, 72.6MB)
테스트 15 〉	통과 (1.97ms, 80.4MB)
테스트 16 〉	통과 (1.29ms, 75.2MB)
테스트 17 〉	통과 (1.89ms, 76.5MB)
테스트 18 〉	통과 (1.24ms, 76.4MB)
테스트 19 〉	통과 (0.97ms, 70.6MB)
테스트 20 〉	통과 (1.91ms, 88MB)
테스트 21 〉	통과 (2.65ms, 82.4MB)
테스트 22 〉	통과 (6.29ms, 100MB)
테스트 23 〉	통과 (4.11ms, 95.4MB)
테스트 24 〉	통과 (3.60ms, 81.3MB)
테스트 25 〉	통과 (0.67ms, 76.7MB)
테스트 26 〉	통과 (0.58ms, 74.6MB)
테스트 27 〉	통과 (0.56ms, 72.9MB)
*/
