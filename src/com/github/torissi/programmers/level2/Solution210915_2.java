package com.github.torissi.programmers.level2;

import java.util.Stack;

public class Solution210915_2 {

    boolean solution(String s) {
        char[] cha = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char a : cha) {
            if (a == '(') {
                stack.push(a);
            } else {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}

/* 올바른 괄호
문제 설명
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
입출력 예
s	answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false
입출력 예 설명
입출력 예 #1,2,3,4
문제의 예시와 같습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.15ms, 71.2MB)
테스트 2 〉	통과 (0.16ms, 69.8MB)
테스트 3 〉	통과 (0.11ms, 71MB)
테스트 4 〉	통과 (0.26ms, 71MB)
테스트 5 〉	통과 (0.20ms, 72MB)
테스트 6 〉	통과 (0.11ms, 57.9MB)
테스트 7 〉	통과 (0.20ms, 72.7MB)
테스트 8 〉	통과 (0.18ms, 59.4MB)
테스트 9 〉	통과 (0.20ms, 72.3MB)
테스트 10 〉	통과 (0.18ms, 60.1MB)
테스트 11 〉	통과 (0.20ms, 68.4MB)
테스트 12 〉	통과 (0.23ms, 72MB)
테스트 13 〉	통과 (0.27ms, 61.4MB)
테스트 14 〉	통과 (0.22ms, 72.9MB)
테스트 15 〉	통과 (0.25ms, 69.3MB)
테스트 16 〉	통과 (0.24ms, 70.1MB)
테스트 17 〉	통과 (0.24ms, 70.7MB)
테스트 18 〉	통과 (0.25ms, 72.4MB)
효율성  테스트
테스트 1 〉	통과 (16.90ms, 53.8MB)
테스트 2 〉	통과 (15.88ms, 53.2MB)
*/
