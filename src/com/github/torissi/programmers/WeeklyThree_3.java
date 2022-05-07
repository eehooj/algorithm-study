package com.github.torissi.programmers;

public class WeeklyThree_3 {

    public static int solution(int n) {
        long mole = 1;
        long deno = 1;
        int num = 2 * n;

        for (int i = 1; i <= n; i++) {
            mole *= num--;
            deno *= i;
        }

        return (int) (mole / (deno * (n + 1)));
    }

    public static void main(String[] args) {
        solution(3);
    }
}


/*
* 1. 괄호의 쌍 n개 입력
* 2. n개의 괄호 쌍으로 만들 수 있는 수 반환
* */

/*
정확성 테스트
테스트 1 〉 통과 (0.03ms, 73.8MB)
테스트 2 〉 통과 (0.03ms, 72.6MB)
테스트 3 〉 통과 (0.02ms, 68.4MB)
테스트 4 〉 통과 (0.02ms, 78.7MB)
테스트 5 〉 통과 (0.02ms, 81.8MB)
테스트 6 〉 통과 (0.02ms, 73.2MB)
테스트 7 〉 통과 (0.01ms, 76.7MB)
테스트 8 〉 통과 (0.01ms, 75.8MB)
테스트 9 〉 통과 (0.02ms, 77MB)
테스트 10 〉 통과 (0.02ms, 73.7MB)
테스트 11 〉 통과 (0.02ms, 77.7MB)
테스트 12 〉 통과 (0.02ms, 78.5MB)
테스트 13 〉 통과 (0.01ms, 74.5MB)
테스트 14 〉 통과 (0.02ms, 74.7MB)
채점 결과
정확성: 100.0
효율성: 0.0
합계: 100.0 / 100.0
* */