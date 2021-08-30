package com.github.torissi.programmers.level1;

public class Solution210818_3 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}

/*짝수와 홀수
문제 설명
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
입출력 예
num	return
3	"Odd"
4	"Even"
*/

/*
테스트 1 〉	통과 (0.02ms, 60.1MB)
테스트 2 〉	통과 (0.02ms, 60MB)
테스트 3 〉	통과 (0.02ms, 69.1MB)
테스트 4 〉	통과 (0.02ms, 61.4MB)
테스트 5 〉	통과 (0.02ms, 71.6MB)
테스트 6 〉	통과 (0.02ms, 69.4MB)
테스트 7 〉	통과 (0.02ms, 73.9MB)
테스트 8 〉	통과 (0.01ms, 69.9MB)
테스트 9 〉	통과 (0.01ms, 57.5MB)
테스트 10 〉	통과 (0.02ms, 72.4MB)
테스트 11 〉	통과 (0.02ms, 71.2MB)
테스트 12 〉	통과 (0.02ms, 71.4MB)
테스트 13 〉	통과 (0.02ms, 59.3MB)
테스트 14 〉	통과 (0.02ms, 68.6MB)
테스트 15 〉	통과 (0.02ms, 70.2MB)
테스트 16 〉	통과 (0.02ms, 60.3MB)
*/

