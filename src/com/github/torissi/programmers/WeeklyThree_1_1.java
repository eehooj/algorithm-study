package com.github.torissi.programmers;

import java.util.Arrays;

public class WeeklyThree_1_1 {

    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .map(c -> c[1])
                .distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c + 1)
                .reduce(1, (c, n) -> c * n);
    }

}


/*
* 1. 매일 다른 옷 조합
* 2. 2차원 배열
* 3. 서로 다른 옷의 조합의 수 리턴
* */