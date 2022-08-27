package com.github.torissi.focus;

public class CalculationOfInsufficientAmount {

    public long solution(int price, int money, int count) {
        long spend = 0;

        for (int i = 1; i <= count; i++) {
            spend += ((long) price * i);
        }

        return money >= spend ? 0 : spend - money;
    }

    public static void main(String[] args) {
        CalculationOfInsufficientAmount add = new CalculationOfInsufficientAmount();
        int price = 3;
        int money = 20;
        int count = 4;

        add.solution(price, money, count);
    }
}

/* 부족한 금액 계산하기
* 1. 놀이기구를 N번째 이용하면 원래 이용료의 N배를 받음
* 2. 놀이기구를 count번 타면 현재 금액에서 얼마 모자른지 리턴 (부족하지 않으면 0)
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.06ms, 70.4MB)
테스트 2 〉	통과 (0.07ms, 75MB)
테스트 3 〉	통과 (0.05ms, 69.9MB)
테스트 4 〉	통과 (0.08ms, 71.9MB)
테스트 5 〉	통과 (0.08ms, 75.5MB)
테스트 6 〉	통과 (0.04ms, 78.1MB)
테스트 7 〉	통과 (0.04ms, 76.6MB)
테스트 8 〉	통과 (0.04ms, 76.8MB)
테스트 9 〉	통과 (0.06ms, 83MB)
테스트 10 〉	통과 (0.07ms, 88.9MB)
테스트 11 〉	통과 (0.05ms, 74.8MB)
테스트 12 〉	통과 (0.09ms, 82.4MB)
테스트 13 〉	통과 (0.06ms, 74.8MB)
테스트 14 〉	통과 (0.09ms, 83MB)
테스트 15 〉	통과 (0.16ms, 75.4MB)
테스트 16 〉	통과 (0.09ms, 78MB)
테스트 17 〉	통과 (0.06ms, 73.5MB)
테스트 18 〉	통과 (0.11ms, 87.9MB)
테스트 19 〉	통과 (0.08ms, 86.5MB)
테스트 20 〉	통과 (0.08ms, 75.3MB)
테스트 21 〉	통과 (0.10ms, 75MB)
테스트 22 〉	통과 (0.07ms, 74.7MB)
테스트 23 〉	통과 (0.08ms, 73.6MB)
* */