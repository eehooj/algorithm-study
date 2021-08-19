package com.github.torissi.programmers;

public class Solution210819_1 {
    public long solution(long n) {
        long answer = -1;

        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                return (i + 1) * (i + 1);
            }
        }

        return answer;
    }
}

/*정수 제곱근 판별
문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.
입출력 예
n	return
121	144
3	-1
입출력 예 설명
입출력 예#1
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

입출력 예#2
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
*/

/*
테스트 1 〉	통과 (6.38ms, 57.8MB)
테스트 2 〉	통과 (15.44ms, 56.3MB)
테스트 3 〉	통과 (7.72ms, 56.9MB)
테스트 4 〉	통과 (5.30ms, 55.8MB)
테스트 5 〉	통과 (0.84ms, 72.1MB)
테스트 6 〉	통과 (1.36ms, 57.3MB)
테스트 7 〉	통과 (3.53ms, 71.9MB)
테스트 8 〉	통과 (0.23ms, 58MB)
테스트 9 〉	통과 (0.75ms, 69.3MB)
테스트 10 〉	통과 (1.18ms, 57.4MB)
테스트 11 〉	통과 (1.88ms, 56.3MB)
테스트 12 〉	통과 (2.64ms, 56.1MB)
테스트 13 〉	통과 (6.03ms, 72.8MB)
테스트 14 〉	통과 (2.19ms, 72.4MB)
테스트 15 〉	통과 (0.42ms, 58.1MB)
테스트 16 〉	통과 (0.40ms, 73.6MB)
테스트 17 〉	통과 (0.03ms, 56.6MB)
테스트 18 〉	통과 (0.02ms, 56.9MB)*/


