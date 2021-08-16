package com.github.torissi.programmers;

public class Solution210816_2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int lengthR = arr1.length;
        int lengthC = arr1[0].length;
        int[][] answer = new int[lengthR][lengthC];

        for (int i = 0; i < lengthR; i++) {
            for (int j = 0; j < lengthC; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}

/*행렬의 덧셈
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
입출력 예
arr1	arr2	return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]	[[3],[4]]	[[4],[6]]
*/

/*테스트 1 〉	통과 (0.03ms, 60MB)
테스트 2 〉	통과 (0.03ms, 73.6MB)
테스트 3 〉	통과 (0.07ms, 60.5MB)
테스트 4 〉	통과 (0.05ms, 74.5MB)
테스트 5 〉	통과 (0.03ms, 72.6MB)
테스트 6 〉	통과 (0.06ms, 72.8MB)
테스트 7 〉	통과 (0.02ms, 70.3MB)
테스트 8 〉	통과 (0.04ms, 61.3MB)
테스트 9 〉	통과 (0.44ms, 74MB)
테스트 10 〉	통과 (0.21ms, 61.6MB)
테스트 11 〉	통과 (0.13ms, 60.1MB)
테스트 12 〉	통과 (0.17ms, 59.7MB)
테스트 13 〉	통과 (0.14ms, 62.2MB)
테스트 14 〉	통과 (0.17ms, 72.2MB)
테스트 15 〉	통과 (0.19ms, 62.4MB)
테스트 16 〉	통과 (0.18ms, 60.4MB)
테스트 17 〉	통과 (3.60ms, 109MB)*/