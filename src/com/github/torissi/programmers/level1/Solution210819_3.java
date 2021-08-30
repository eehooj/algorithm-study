package com.github.torissi.programmers.level1;

public class Solution210819_3 {
    public int[] solution(long n) {
        char[] a = String.valueOf(n).toCharArray();
        int[] answer = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            answer[i] = Character.getNumericValue(a[a.length - (i + 1)]);
        }

        return answer;
    }
}

/*자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/

/*
테스트 1 〉	통과 (0.05ms, 57.8MB)
테스트 2 〉	통과 (0.07ms, 67.3MB)
테스트 3 〉	통과 (0.05ms, 56.7MB)
테스트 4 〉	통과 (0.04ms, 73.3MB)
테스트 5 〉	통과 (0.07ms, 70.8MB)
테스트 6 〉	통과 (0.07ms, 58.4MB)
테스트 7 〉	통과 (0.05ms, 57.5MB)
테스트 8 〉	통과 (0.04ms, 58.5MB)
테스트 9 〉	통과 (0.07ms, 64.6MB)
테스트 10 〉	통과 (0.04ms, 57.9MB)
테스트 11 〉	통과 (0.05ms, 56.3MB)
테스트 12 〉	통과 (0.04ms, 57MB)
테스트 13 〉	통과 (0.06ms, 57.6MB)
*/


