package com.github.torissi.programmers;

import java.util.Arrays;

public class Solution210822_3 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(a -> a % divisor == 0).sorted().toArray();
        if (answer.length == 0) {
            answer = new int[] {-1};
        }
        return answer;
    }
}

/* 나누어 떨어지는 숫자 배열
문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
입출력 예 설명
입출력 예#1
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

입출력 예#2
arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

입출력 예#3
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
*/

/*
테스트 1 〉	통과 (6.23ms, 71.3MB)
테스트 2 〉	통과 (2.46ms, 60.1MB)
테스트 3 〉	통과 (5.05ms, 59.9MB)
테스트 4 〉	통과 (5.53ms, 75.6MB)
테스트 5 〉	통과 (5.59ms, 67.8MB)
테스트 6 〉	통과 (8.53ms, 78.4MB)
테스트 7 〉	통과 (10.06ms, 75.1MB)
테스트 8 〉	통과 (5.24ms, 59.3MB)
테스트 9 〉	통과 (6.83ms, 69.3MB)
테스트 10 〉	통과 (3.01ms, 57.6MB)
테스트 11 〉	통과 (2.63ms, 71MB)
테스트 12 〉	통과 (2.89ms, 71.2MB)
테스트 13 〉	통과 (3.01ms, 74.4MB)
테스트 14 〉	통과 (5.72ms, 62.3MB)
테스트 15 〉	통과 (2.77ms, 72.5MB)
테스트 16 〉	통과 (2.47ms, 60.7MB)
=> 스트림이 진짜 오래 걸리긴 하네
*/