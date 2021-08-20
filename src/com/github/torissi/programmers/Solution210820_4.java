package com.github.torissi.programmers;

public class Solution210820_4 {
    public String solution(int n) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                builder.append("수");
            } else {
                builder.append("박");
            }
        }

        return builder.toString();
    }
}

/*수박수박수박수박수박수?
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	"수박수"
4	"수박수박"
*/

/*
테스트 1 〉	통과 (0.13ms, 57.5MB)
테스트 2 〉	통과 (0.33ms, 56.7MB)
테스트 3 〉	통과 (0.27ms, 71.3MB)
테스트 4 〉	통과 (0.56ms, 57.2MB)
테스트 5 〉	통과 (0.23ms, 56.8MB)
테스트 6 〉	통과 (0.05ms, 56.4MB)
테스트 7 〉	통과 (0.05ms, 57.6MB)
테스트 8 〉	통과 (0.05ms, 57.3MB)
테스트 9 〉	통과 (0.07ms, 58MB)
테스트 10 〉	통과 (0.05ms, 67.7MB)
테스트 11 〉	통과 (0.06ms, 57.7MB)
테스트 12 〉	통과 (0.10ms, 57MB)
테스트 13 〉	통과 (0.06ms, 58MB)
테스트 14 〉	통과 (0.09ms, 58.1MB)
테스트 15 〉	통과 (1.44ms, 59.5MB)
테스트 16 〉	통과 (0.05ms, 58.3MB)
*/
