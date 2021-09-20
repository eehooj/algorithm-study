package com.github.torissi.programmers.level2;

public class Solution210920_1 {

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        String[] num = number.split("");
        int lengthK = number.length() - k;
        int pointer = 0;

        for (int i = 0; i < lengthK; i++) {
            int max = 0;
            for (int j = pointer; j <= k + i; j++) {
                int temp = Integer.parseInt(num[j]);
                if (temp == 9) {
                    max = temp;
                    pointer = j + 1;
                    break;
                }

                if (temp > max) {
                    max = temp;
                    pointer = j + 1;
                }
            }

            answer.append(max);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        solution("1924", 2);
    }
}

/* 큰 수 만들기
문제 설명
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건
number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.
입출력 예
number	k	return
"1924"	2	"94"
"1231234"	3	"3234"
"4177252841"	4	"775841"
*/

/*
테스트 1 〉	통과 (0.20ms, 73MB)
테스트 2 〉	통과 (0.28ms, 77MB)
테스트 3 〉	통과 (0.59ms, 70.5MB)
테스트 4 〉	통과 (2.18ms, 71MB)
테스트 5 〉	통과 (1.97ms, 70.5MB)
테스트 6 〉	통과 (11.60ms, 74.4MB)
테스트 7 〉	통과 (41.71ms, 80.3MB)
테스트 8 〉	통과 (49.89ms, 81.9MB)
테스트 9 〉	통과 (146.02ms, 121MB)
테스트 10 〉	통과 (137.49ms, 121MB)
테스트 11 〉	통과 (0.17ms, 60.7MB)
테스트 12 〉	통과 (0.13ms, 73.6MB)
*/
