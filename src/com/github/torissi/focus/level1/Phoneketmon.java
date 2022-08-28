package com.github.torissi.focus.level1;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {

    public int solution(int[] nums) {
        Set<Integer> type = new HashSet<>();
        int max = nums.length / 2;

        for (int num : nums) {
            type.add(num);
        }

        return Math.min(max, type.size());
    }

    public static void main(String[] args) {
        Phoneketmon add = new Phoneketmon();
        int[] survey = {3,3,3,2,2,2};

        System.out.println(add.solution(survey));
    }
}


/* 폰켓몬
* 1. 연구실에 있는 총 N마리 중 N/2 마리를 가져가도 좋다함
* 2. 종류별로 같은 번호를 가지고 있음
* 3. 동일 종류는 고를 수 없음
* 4. 최대한 많은 종류의 폰켓몬을 선택 -> 갯수 리턴
* */

/*
* */