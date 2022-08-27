package com.github.torissi.focus;

import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int item : d) {
            if (budget - item >= 0) {
                answer++;
                budget -= item;
            } else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Budget add = new Budget();
        int[] signs = {2,2,3,3};
        int N = 10;

        add.solution(signs, N);
    }
}

/* 예산
* 1. 부서가 신청한 금액만큼 모두 지원해야 함
* 2. 최대 몇 개의 부서에 물품을 지원할 수 있는지 리턴
* */
