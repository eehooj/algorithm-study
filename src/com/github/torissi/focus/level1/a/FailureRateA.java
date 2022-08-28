package com.github.torissi.focus.level1.a;

import java.util.*;

public class FailureRateA {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> player = new HashMap<>();
        Map<Integer, Double> failRate = new HashMap<>();
        int totalUser = stages.length;

        for (Integer stage : stages) {
            if (stage <= N) {
                player.put(stage, player.getOrDefault(stage, 0) + 1);
            }
        }

        for (int i = 1; i <= N; i++) {
            if (player.containsKey(i)) {
                failRate.put(i, (double) player.get(i) / totalUser);
                totalUser -= player.get(i);
            } else {
                failRate.put(i, 0.0);
            }
        }

        List<Integer> keys = new ArrayList<>(failRate.keySet());

        keys.sort((a, b) -> (failRate.get(b).compareTo(failRate.get(a))));

        int index = 0;

        for (Integer key : keys) {
            answer[index] = key;
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        FailureRateA add = new FailureRateA();
        int N = 5;
        int[] signs = {2, 1, 2, 6, 2, 4, 3, 3};

        add.solution(N, signs);
    }
}

/* 실패율
* 1. 실패율 = 도달했으나 클리어 못한 플레이어 수 / 도달한 플레이어 수
* 2. 실패율이 높은 순서부터 내림차순으로 스테이지 번호가 담긴 배열 리턴
* */
