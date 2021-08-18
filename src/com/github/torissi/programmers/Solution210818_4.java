package com.github.torissi.programmers;

public class Solution210818_4 {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            int[] a = new int[1];
            a[0] = -1;
            return a;
        }

        int temp = arr[0];
        int min = 0;
        for (int i = 1; i < length - 1; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
                min = i;
            }
        }

        arr[min] = 0;
        int[] answer = new int[length - 1];
        for(int i = min; i < length -1; i++) {
            arr[i] = arr[i+1];
        }

        for (int i = 0; i < length - 1; i++) {
            answer[i] = arr[i];
        }

        for (int i : answer) {
            System.out.println("answer : " + i);
        }


        return answer;
    }

}

/*제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
*/

/*
테스트 1 〉	통과 (2.57ms, 68.5MB)
테스트 2 〉	통과 (0.07ms, 73.1MB)
테스트 3 〉	통과 (0.05ms, 58.2MB)
테스트 4 〉	통과 (0.03ms, 57.4MB)
테스트 5 〉	통과 (0.02ms, 56.9MB)
테스트 6 〉	통과 (0.08ms, 69.9MB)
테스트 7 〉	통과 (0.11ms, 59.6MB)
테스트 8 〉	통과 (0.02ms, 58.7MB)
테스트 9 〉	통과 (0.02ms, 57.4MB)
테스트 10 〉	통과 (0.01ms, 58MB)
테스트 11 〉	통과 (0.02ms, 57.6MB)
테스트 12 〉	통과 (0.02ms, 58.4MB)
테스트 13 〉	통과 (0.03ms, 68.4MB)
테스트 14 〉	통과 (0.09ms, 57.4MB)
테스트 15 〉	통과 (0.02ms, 67.1MB)
테스트 16 〉	통과 (0.10ms, 56.3MB)
*/

