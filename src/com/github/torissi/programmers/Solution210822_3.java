package com.github.torissi.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution210822_3 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
                count++;
            }
        }

        if (count == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            answer = new int[count];
            for (int i = 0; i < count; i++) {
                answer[i] = list.get(i);
            }
        }

        Arrays.sort(answer);

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
테스트 1 〉	통과 (0.41ms, 71.2MB)
테스트 2 〉	통과 (0.34ms, 69.1MB)
테스트 3 〉	통과 (0.33ms, 68.6MB)
테스트 4 〉	통과 (0.33ms, 63.3MB)
테스트 5 〉	통과 (0.35ms, 70.6MB)
테스트 6 〉	통과 (1.37ms, 74.9MB)
테스트 7 〉	통과 (0.08ms, 69.1MB)
테스트 8 〉	통과 (0.02ms, 60MB)
테스트 9 〉	통과 (0.37ms, 73.8MB)
테스트 10 〉	통과 (0.58ms, 73.6MB)
테스트 11 〉	통과 (0.37ms, 61.1MB)
테스트 12 〉	통과 (0.40ms, 59.7MB)
테스트 13 〉	통과 (0.11ms, 72MB)
테스트 14 〉	통과 (0.40ms, 73.2MB)
테스트 15 〉	통과 (0.44ms, 73.3MB)
테스트 16 〉	통과 (0.52ms, 70.6MB)
*/