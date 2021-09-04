package com.github.torissi.programmers.level1;

public class Solution210904_2 {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }
}

/* 내적
문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

제한사항
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
입출력 예
a	b	result
[1,2,3,4]	[-3,-1,0,2]	3
[-1,0,1]	[1,0,-1]	-2
입출력 예 설명
입출력 예 #1

a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
입출력 예 #2

a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
*/

/*
테스트 1 〉	통과 (0.04ms, 71.6MB)
테스트 2 〉	통과 (0.02ms, 76.1MB)
테스트 3 〉	통과 (0.04ms, 71.9MB)
테스트 4 〉	통과 (0.01ms, 68.5MB)
테스트 5 〉	통과 (0.02ms, 70.6MB)
테스트 6 〉	통과 (0.04ms, 69.1MB)
테스트 7 〉	통과 (0.03ms, 76.4MB)
테스트 8 〉	통과 (0.04ms, 71.5MB)
테스트 9 〉	통과 (0.05ms, 59.7MB)
*/