package com.github.torissi.programmers;

import java.util.Arrays;

public class Solution210821_3 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] cha = s.toCharArray();
        Arrays.sort(cha);

        for (int i = s.length() - 1; i >= 0; i--) {
            answer.append(cha[i]);
        }

        return answer.toString();
    }
}

/*문자열 내림차순으로 배치하기
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
"Zbcdefg"	"gfedcbZ"
*/

/*
테스트 1 〉	통과 (0.32ms, 72.1MB)
테스트 2 〉	통과 (0.32ms, 69.3MB)
테스트 3 〉	통과 (0.36ms, 61.1MB)
테스트 4 〉	통과 (0.34ms, 58.9MB)
테스트 5 〉	통과 (0.46ms, 69.6MB)
테스트 6 〉	통과 (0.40ms, 67.8MB)
테스트 7 〉	통과 (0.33ms, 57.6MB)
테스트 8 〉	통과 (0.35ms, 61.2MB)
테스트 9 〉	통과 (0.34ms, 68.5MB)
테스트 10 〉	통과 (0.37ms, 71MB)
테스트 11 〉	통과 (0.33ms, 58.7MB)
테스트 12 〉	통과 (0.45ms, 63.2MB)
테스트 13 〉	통과 (0.36ms, 58.9MB)
테스트 14 〉	통과 (0.35ms, 59.1MB)
테스트 15 〉	통과 (0.32ms, 59.4MB)
테스트 16 〉	통과 (0.32ms, 72.8MB)
* */