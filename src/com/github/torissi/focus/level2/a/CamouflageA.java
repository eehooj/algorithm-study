package com.github.torissi.focus.level2.a;

import java.util.HashMap;
import java.util.Map;

public class CamouflageA {

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> style = new HashMap<>();

        for (String[] item : clothes) {
            style.put(item[1], style.getOrDefault(item[1], 0) + 1);
        }

        for (Integer item : style.values()) {
            answer *= (item + 1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        CamouflageA f = new CamouflageA();
        String[][] item = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        f.solution(item);
    }
}

/* 위장
* 1. 매일 다른 옷을 조합하여 입어야 함
* 2. 서로 다른 옷의 조합 수를 리턴턴
* */

/*
정확성  테스트
테스트  〉	통과 (0.19ms, 71.3MB)
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