package com.github.torissi.programmers.level2;

public class Solution210911_2 {

    public String solution(String s) {
        String[] a = s.split(" ");

        int max = -2147483648;
        int min = 2147483647;

        for (String token : a) {
            int temp = Integer.parseInt(token);

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
테스트 1 〉	통과 (8.35ms, 73MB)
테스트 2 〉	통과 (8.56ms, 73.3MB)
테스트 3 〉	통과 (8.59ms, 73.9MB)
테스트 4 〉	통과 (9.58ms, 74.4MB)
테스트 5 〉	통과 (11.51ms, 71.4MB)
테스트 6 〉	통과 (11.07ms, 78.2MB)
테스트 7 〉	통과 (8.88ms, 72.2MB)
테스트 8 〉	통과 (9.44ms, 71.9MB)
테스트 9 〉	통과 (8.90ms, 72.2MB)
테스트 10 〉	통과 (8.31ms, 69.9MB)
테스트 11 〉	통과 (8.63ms, 71.5MB)
테스트 12 〉	통과 (9.26ms, 75.2MB)
*/
