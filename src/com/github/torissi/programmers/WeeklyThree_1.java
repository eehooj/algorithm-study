package com.github.torissi.programmers;

import java.util.HashMap;

public class WeeklyThree_1 {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] item : clothes) {
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }

        for (Integer item : map.values()) {
            answer *= (item + 1); // + 1은 사용하지 않았을 경우의 수
        }

        return answer;
    }

}


/*
* 1. 매일 다른 옷 조합
* 2. 2차원 배열
* 3. 서로 다른 옷의 조합의 수 리턴
* */