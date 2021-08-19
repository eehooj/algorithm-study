package com.github.torissi.programmers;

public class Solution210819_5 {
    public String solution(String s) {
        String[] str = s.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String value : str) {
            String[] temp = value.split("");

            if (!value.isEmpty()) {
                for (int j = 0; j < temp.length; j++) {
                    if (j % 2 == 0) {
                        builder.append(temp[j].toUpperCase());
                    } else {
                        builder.append(temp[j].toLowerCase());
                    }
                }
            }
            builder.append(" ");
        }

        if (s.length() > builder.length()) {
            int i1 = s.length() - builder.length();
            for (int i = 0; i < i1; i++) {
                builder.append(" ");
            }
        }

        return builder.substring(0, s.length());
    }
}

/*이상한 문자 만들기
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
입출력 예
s	return
"try hello world"	"TrY HeLlO WoRlD"
입출력 예 설명
"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
*/

/*
테스트 1 〉	통과 (0.38ms, 55.7MB)
테스트 2 〉	통과 (0.19ms, 57MB)
테스트 3 〉	통과 (0.35ms, 59.1MB)
테스트 4 〉	통과 (10.30ms, 56.7MB)
테스트 5 〉	통과 (0.67ms, 55.9MB)
테스트 6 〉	통과 (0.19ms, 57.5MB)
테스트 7 〉	통과 (0.30ms, 57.5MB)
테스트 8 〉	통과 (1.38ms, 57MB)
테스트 9 〉	통과 (0.52ms, 68.7MB)
테스트 10 〉	통과 (1.54ms, 56.2MB)
테스트 11 〉	통과 (1.13ms, 73.3MB)
테스트 12 〉	통과 (2.37ms, 57.4MB)
테스트 13 〉	통과 (0.50ms, 57.1MB)
테스트 14 〉	통과 (0.27ms, 64.1MB)
테스트 15 〉	통과 (0.50ms, 56.6MB)
테스트 16 〉	통과 (1.81ms, 57.8MB)
*/


