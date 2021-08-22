package com.github.torissi.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution210822_2 {
    public long solution(int a, int b) {
        return arithmetic(Math.min(a, b), Math.max(a,b));
    }

    private long arithmetic(int min, int max) {
        return (long) (max - min + 1) * (max + min) / 2;
    }
}

/* 두 정수 사이의 합
문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.
입출력 예
a	b	return
3	5	12
3	3	3
5	3	12
*/

/*
테스트 1 〉	통과 (0.02ms, 72.7MB)
테스트 2 〉	통과 (0.09ms, 71.2MB)
테스트 3 〉	통과 (0.07ms, 73.7MB)
테스트 4 〉	통과 (0.03ms, 74.3MB)
테스트 5 〉	통과 (0.11ms, 70.1MB)
테스트 6 〉	통과 (0.03ms, 68.3MB)
테스트 7 〉	통과 (0.03ms, 60.5MB)
테스트 8 〉	통과 (0.03ms, 72.3MB)
테스트 9 〉	통과 (0.03ms, 71.7MB)
테스트 10 〉	통과 (0.09ms, 57.9MB)
테스트 11 〉	통과 (0.03ms, 70.7MB)
테스트 12 〉	통과 (0.04ms, 69.3MB)
테스트 13 〉	통과 (0.03ms, 57.7MB)
테스트 14 〉	통과 (0.03ms, 72.1MB)
테스트 15 〉	통과 (0.03ms, 72.1MB)
테스트 16 〉	통과 (0.04ms, 70.5MB)
=> 등차 수열.....
*/