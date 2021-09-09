package com.github.torissi.programmers.level2;

public class Solution210909_1 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int aLength = arr1.length; //2
        int bLength = arr2[0].length;
        int[][] answer = new int[aLength][bLength];

        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < bLength; j++) {
                int sum = 0;
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3},{4, 5, 6}};
        int[][] arr2 = {{1, 4},{2, 5},{3, 6}};
        solution(arr1, arr2); //[[14, 32], [32, 77]]
    }
}

/* 행렬의 곱셈
문제 설명
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
곱할 수 있는 배열만 주어집니다.
입출력 예
arr1	arr2	return
[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
*/

/*
테스트 1 〉	통과 (0.64ms, 71.5MB)
테스트 2 〉	통과 (5.21ms, 76.4MB)
테스트 3 〉	통과 (5.37ms, 62.2MB)
테스트 4 〉	통과 (0.27ms, 69.8MB)
테스트 5 〉	통과 (4.42ms, 60.3MB)
테스트 6 〉	통과 (2.77ms, 77.7MB)
테스트 7 〉	통과 (0.25ms, 61.4MB)
테스트 8 〉	통과 (0.18ms, 75.2MB)
테스트 9 〉	통과 (0.10ms, 60.5MB)
테스트 10 〉	통과 (4.11ms, 73.8MB)
테스트 11 〉	통과 (0.83ms, 71.9MB)
테스트 12 〉	통과 (0.12ms, 62.7MB)
테스트 13 〉	통과 (4.10ms, 60.3MB)
테스트 14 〉	통과 (6.41ms, 61.3MB)
테스트 15 〉	통과 (2.77ms, 73.7MB)
테스트 16 〉	통과 (1.34ms, 60MB)
*/
