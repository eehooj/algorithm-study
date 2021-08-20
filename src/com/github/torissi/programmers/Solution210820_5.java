package com.github.torissi.programmers;

public class Solution210820_5 {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i + i; j <= n; j += i) {
                arr[j] = false;
            }
        }

        for (boolean b : arr) {
            if (b) {
                answer++;
            }
        }

        return answer;
    }
}

/*소수 찾기
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 72.2MB)
테스트 2 〉	통과 (0.04ms, 57MB)
테스트 3 〉	통과 (0.06ms, 57.5MB)
테스트 4 〉	통과 (0.10ms, 57.1MB)
테스트 5 〉	통과 (0.08ms, 57.3MB)
테스트 6 〉	통과 (0.79ms, 57.3MB)
테스트 7 〉	통과 (0.24ms, 58.2MB)
테스트 8 〉	통과 (0.73ms, 57.6MB)
테스트 9 〉	통과 (1.72ms, 66.7MB)
테스트 10 〉	통과 (9.19ms, 57.4MB)
테스트 11 〉	통과 (20.00ms, 57.7MB)
테스트 12 〉	통과 (10.57ms, 57MB)
효율성  테스트
테스트 1 〉	통과 (41.87ms, 53.5MB)
테스트 2 〉	통과 (22.92ms, 53.2MB)
테스트 3 〉	통과 (28.68ms, 53.5MB)
테스트 4 〉	통과 (23.66ms, 53.3MB)
*/

/*에라토스테네스 체
* 소수들을 대량으로 빠르고 정확하게 구하는 방법
* */