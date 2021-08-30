package com.github.torissi.programmers.level1;

public class Solution210819_5 {
    public String solution(String s) {
        String[] str = s.split("");
        StringBuilder builder = new StringBuilder();
        int count = 0;

        for (String value : str) {
            count = value.contains(" ") ? 0 : count + 1;

            if (count % 2 == 0) {
                builder.append(value.toLowerCase());
            } else {
                builder.append(value.toUpperCase());
            }

        }

        return builder.toString();
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
테스트 1 〉	통과 (0.22ms, 56.7MB)
테스트 2 〉	통과 (0.12ms, 57.7MB)
테스트 3 〉	통과 (0.23ms, 57.3MB)
테스트 4 〉	통과 (0.84ms, 68.3MB)
테스트 5 〉	통과 (0.32ms, 59MB)
테스트 6 〉	통과 (0.13ms, 71.9MB)
테스트 7 〉	통과 (0.16ms, 56.3MB)
테스트 8 〉	통과 (0.55ms, 57MB)
테스트 9 〉	통과 (0.38ms, 57.3MB)
테스트 10 〉	통과 (0.93ms, 70.2MB)
테스트 11 〉	통과 (0.87ms, 70.7MB)
테스트 12 〉	통과 (1.72ms, 58.6MB)
테스트 13 〉	통과 (0.34ms, 67.5MB)
테스트 14 〉	통과 (0.23ms, 56.8MB)
테스트 15 〉	통과 (0.26ms, 68.4MB)
테스트 16 〉	통과 (0.63ms, 57MB)
=> 처음에 문제를 잘 못 이해해서 엄청 헤맴. 띄어쓰기는 없애는 줄 알았는데 띄어쓰기까지 품어야 했음
=> 때문에 처음 split을 " "가 아닌 ""로 하여 모든 것을 배열에 담아야 했음
*/




