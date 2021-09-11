package com.github.torissi.programmers.level2;

import java.util.StringTokenizer;

public class Solution210911_2 {

    public String solution(String s) {
        StringTokenizer token = new StringTokenizer(s);

        int max = -2147483648;
        int min = 2147483647;

        while (token.hasMoreTokens()) {
            int temp = Integer.parseInt(token.nextToken());

            if (temp > max) {
                max = temp;
            }

            if (temp < min) {
                min = temp;
            }
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
    }
}

/* 최댓값과 최솟값
문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
입출력 예
s	return
"1 2 3 4"	"1 4"
"-1 -2 -3 -4"	"-4 -1"
"-1 -1"	"-1 -1"
*/

/*
테스트 1 〉	통과 (8.87ms, 67.8MB)
테스트 2 〉	통과 (10.56ms, 74.1MB)
테스트 3 〉	통과 (10.63ms, 73.1MB)
테스트 4 〉	통과 (12.84ms, 76.8MB)
테스트 5 〉	통과 (8.39ms, 59MB)
테스트 6 〉	통과 (10.31ms, 74MB)
테스트 7 〉	통과 (10.32ms, 71.2MB)
테스트 8 〉	통과 (10.05ms, 59.2MB)
테스트 9 〉	통과 (8.39ms, 58.1MB)
테스트 10 〉	통과 (13.25ms, 72.5MB)
테스트 11 〉	통과 (10.00ms, 74.2MB)
테스트 12 〉	통과 (10.37ms, 70.1MB)
*/
