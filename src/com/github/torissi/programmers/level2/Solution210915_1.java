package com.github.torissi.programmers.level2;

public class Solution210915_1 {

    public int solution(int n) {
        int answer = 0;
        int num = n + 1;
        String nm = Integer.toBinaryString(n);
        int count = checkCount(n);

        for (int i = num; i < 1000000; i++) {
            int compare = checkCount(i);
            if (count == compare) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    private int checkCount(int n) {
        String nm = Integer.toBinaryString(n);
        int count = 0;

        for (String a : nm.split("")) {
            if (a.equals("1")) {
                count++;
            }
        }

        return count;
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
테스트 1 〉	통과 (0.27ms, 60MB)
테스트 2 〉	통과 (0.16ms, 70.5MB)
테스트 3 〉	통과 (0.22ms, 60MB)
테스트 4 〉	통과 (0.18ms, 57.4MB)
테스트 5 〉	통과 (0.33ms, 62MB)
테스트 6 〉	통과 (0.24ms, 69.4MB)
테스트 7 〉	통과 (0.45ms, 71.4MB)
테스트 8 〉	통과 (0.18ms, 70.1MB)
테스트 9 〉	통과 (0.40ms, 69.3MB)
테스트 10 〉	통과 (0.45ms, 74.6MB)
테스트 11 〉	통과 (0.26ms, 66.8MB)
테스트 12 〉	통과 (0.22ms, 70MB)
테스트 13 〉	통과 (0.19ms, 60.9MB)
테스트 14 〉	통과 (0.20ms, 63.1MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
테스트 5 〉	실패 (시간 초과)
테스트 6 〉	실패 (시간 초과)
*/
