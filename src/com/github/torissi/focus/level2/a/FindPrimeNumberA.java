package com.github.torissi.focus.level2.a;

import java.util.HashSet;

public class FindPrimeNumberA {

    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);

        for (int item : set) {
            if (isPrime(item)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(int item) {
        if (item == 1 || item == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(item);

        for (int i = 2; i < limit; i++) {
            if (item % i == 0) {
                return false;
            }
        }

        return true;
    }

    private void recursive(String s, String numbers) {
        int length = numbers.length();

        if (!s.equals("")) {
            set.add(Integer.valueOf(s));
        }

        for (int i = 0; i < length; i++) {
            recursive(s + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i  +1));
        }
    }

    public static void main(String[] args) {
        FindPrimeNumberA a = new FindPrimeNumberA();

        a.solution("011");
    }
}

/* 소수 찾기
* 1. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는 지 알아내고 싶음
* 2. 소수 몇 개인지 리턴
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.19ms, 71.3MB)
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