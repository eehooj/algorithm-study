package com.github.torissi.programmers.level2;

import java.util.Arrays;

public class Solution210923_1 {

    public static String solution(int[] numbers) {
        StringBuilder builder = new StringBuilder();
        int length = numbers.length;
        String[] str = new String[length];

        for (int i = 0; i < length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (str[0].equals("0")) {
            return "0";
        }

        for (String a : str) {
            builder.append(a);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);
    }
}

/* 가장 큰 수
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"
*/

/*
정확성  테스트
테스트 1 〉	통과 (130.56ms, 135MB)
테스트 2 〉	통과 (68.97ms, 81.4MB)
테스트 3 〉	통과 (154.32ms, 126MB)
테스트 4 〉	통과 (12.31ms, 79.3MB)
테스트 5 〉	통과 (108.37ms, 125MB)
테스트 6 〉	통과 (97.20ms, 106MB)
테스트 7 〉	통과 (1.96ms, 59.2MB)
테스트 8 〉	통과 (1.82ms, 70.6MB)
테스트 9 〉	통과 (2.13ms, 60.2MB)
테스트 10 〉	통과 (2.37ms, 59.3MB)
테스트 11 〉	통과 (1.98ms, 59MB)
*/
