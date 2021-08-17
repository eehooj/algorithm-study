package com.github.torissi.programmers;

public class Solution210817_1 {
    public double solution(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / (double) arr.length;
    }
}

/*평균 구하기
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5
*/

/*
테스트 1 〉	통과 (0.01ms, 59.2MB)
테스트 2 〉	통과 (0.03ms, 69.3MB)
테스트 3 〉	통과 (0.02ms, 60.1MB)
테스트 4 〉	통과 (0.01ms, 71.6MB)
테스트 5 〉	통과 (0.02ms, 74.4MB)
테스트 6 〉	통과 (0.02ms, 74.8MB)
테스트 7 〉	통과 (0.02ms, 58.9MB)
테스트 8 〉	통과 (0.02ms, 72.6MB)
테스트 9 〉	통과 (0.03ms, 63MB)
테스트 10 〉	통과 (0.02ms, 60.8MB)
테스트 11 〉	통과 (0.02ms, 63.2MB)
테스트 12 〉	통과 (0.03ms, 71.6MB)
테스트 13 〉	통과 (0.02ms, 70.2MB)
테스트 14 〉	통과 (0.02ms, 69.5MB)
테스트 15 〉	통과 (0.03ms, 72.1MB)
테스트 16 〉	통과 (0.02ms, 74.8MB)*/