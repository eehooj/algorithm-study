package com.github.torissi.programmers;

public class Solution210823_1 {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        char[] cha = s.toCharArray();
        int length = cha.length;
        int center = length / 2;

        if (length % 2 == 0) {
            builder.append(cha[center - 1]);
            builder.append(cha[center]);
        } else {
            builder.append(cha[center]);
        }

        return builder.toString();
    }
}

/* 가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
*/

/*
테스트 1 〉	통과 (0.03ms, 58.4MB)
테스트 2 〉	통과 (0.04ms, 60.6MB)
테스트 3 〉	통과 (0.03ms, 60.6MB)
테스트 4 〉	통과 (0.03ms, 69.4MB)
테스트 5 〉	통과 (0.03ms, 74.1MB)
테스트 6 〉	통과 (0.03ms, 67.5MB)
테스트 7 〉	통과 (0.03ms, 71.5MB)
테스트 8 〉	통과 (0.03ms, 71.8MB)
테스트 9 〉	통과 (0.05ms, 68.9MB)
테스트 10 〉	통과 (0.04ms, 71.1MB)
테스트 11 〉	통과 (0.03ms, 58.1MB)
테스트 12 〉	통과 (0.05ms, 74.6MB)
테스트 13 〉	통과 (0.03ms, 59.7MB)
테스트 14 〉	통과 (0.04ms, 70.4MB)
테스트 15 〉	통과 (0.03ms, 59.2MB)
테스트 16 〉	통과 (0.03ms, 71.1MB)
*/