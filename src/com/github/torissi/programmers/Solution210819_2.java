package com.github.torissi.programmers;

import java.util.Arrays;

public class Solution210819_2 {
    public long solution(long n) {
        StringBuilder builder = new StringBuilder();
        char[] cha = String.valueOf(n).toCharArray();
        Arrays.sort(cha);

        for (int i = cha.length -1; i >= 0; i-- ) {
            builder.append(cha[i]);
        }

        return Long.parseLong(builder.toString());
    }
}

/*정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
*/

/*
테스트 1 〉	통과 (0.54ms, 70.9MB)
테스트 2 〉	통과 (0.49ms, 57.9MB)
테스트 3 〉	통과 (0.60ms, 71.4MB)
테스트 4 〉	통과 (0.45ms, 56.6MB)
테스트 5 〉	통과 (0.55ms, 56.3MB)
테스트 6 〉	통과 (3.30ms, 72.9MB)
테스트 7 〉	통과 (0.58ms, 58.8MB)
테스트 8 〉	통과 (0.49ms, 56.4MB)
테스트 9 〉	통과 (0.72ms, 57.6MB)
테스트 10 〉	통과 (0.55ms, 57.1MB)
테스트 11 〉	통과 (0.44ms, 57.5MB)
테스트 12 〉	통과 (0.41ms, 57.6MB)
테스트 13 〉	통과 (0.77ms, 56.2MB)
테스트 14 〉	통과 (2.42ms, 56.5MB)
테스트 15 〉	통과 (0.56ms, 58MB)
테스트 16 〉	통과 (0.44ms, 71.1MB)
*/


