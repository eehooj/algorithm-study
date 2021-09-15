package com.github.torissi.programmers.level2;

public class Solution210915_1 {

    public int solution(int n) {
        int answer = 0;
        int num = n + 1;
        int count = Integer.bitCount(n);

        for (int i = num; i < 1000000; i++) {
            if (count == Integer.bitCount(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
    }
}

/* 다음 큰 숫자
문제 설명
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한 사항
n은 1,000,000 이하의 자연수 입니다.
입출력 예
n	result
78	83
15	23
입출력 예 설명
입출력 예#1
문제 예시와 같습니다.
입출력 예#2
15(1111)의 다음 큰 숫자는 23(10111)입니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 69MB)
테스트 2 〉	통과 (0.02ms, 70.7MB)
테스트 3 〉	통과 (0.02ms, 71.5MB)
테스트 4 〉	통과 (0.02ms, 59.7MB)
테스트 5 〉	통과 (0.03ms, 70MB)
테스트 6 〉	통과 (0.02ms, 58.2MB)
테스트 7 〉	통과 (0.02ms, 73MB)
테스트 8 〉	통과 (0.03ms, 71.5MB)
테스트 9 〉	통과 (0.02ms, 66.5MB)
테스트 10 〉	통과 (0.02ms, 70.6MB)
테스트 11 〉	통과 (0.01ms, 70.9MB)
테스트 12 〉	통과 (0.02ms, 59MB)
테스트 13 〉	통과 (0.02ms, 68.4MB)
테스트 14 〉	통과 (0.02ms, 75MB)
효율성  테스트
테스트 1 〉	통과 (0.02ms, 52.5MB)
테스트 2 〉	통과 (0.02ms, 52.2MB)
테스트 3 〉	통과 (0.02ms, 52.7MB)
테스트 4 〉	통과 (0.02ms, 52.1MB)
테스트 5 〉	통과 (0.03ms, 52.4MB)
테스트 6 〉	통과 (0.02ms, 51.6MB)
*/
