package com.github.torissi.programmers.level1;

public class Solution210908_2 {

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");
        String temp = str[0].toUpperCase();
        answer.append(temp);

        for (int i = 1; i < str.length; i++) {
            if (temp.equals(" ")) {
                answer.append(str[i].toUpperCase());
            } else {
                answer.append(str[i].toLowerCase());
            }

            temp = str[i];
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        solution("3people unFollowed me");
    }
}

/* JadenCase 문자열 만들기
문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
입출력 예
s	return
"3people unFollowed me"	"3people Unfollowed Me"
"for the last week"	"For The Last Week"
*/

/*
테스트 1 〉	통과 (0.19ms, 73.8MB)
테스트 2 〉	통과 (0.31ms, 66.3MB)
테스트 3 〉	통과 (0.36ms, 68.8MB)
테스트 4 〉	통과 (0.32ms, 73MB)
테스트 5 〉	통과 (0.84ms, 67.6MB)
테스트 6 〉	통과 (0.61ms, 69.2MB)
테스트 7 〉	통과 (0.27ms, 71.6MB)
테스트 8 〉	통과 (0.18ms, 69.3MB)
테스트 9 〉	통과 (0.44ms, 72.2MB)
테스트 10 〉	통과 (0.17ms, 70.4MB)
테스트 11 〉	통과 (0.89ms, 68.9MB)
테스트 12 〉	통과 (0.29ms, 72.3MB)
테스트 13 〉	통과 (0.28ms, 72.6MB)
테스트 14 〉	통과 (0.59ms, 74MB)
테스트 15 〉	통과 (0.63ms, 68.9MB)
테스트 16 〉	통과 (0.22ms, 72.4MB)
*/
