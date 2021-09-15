package com.github.torissi.programmers.level2;

import java.util.Stack;

public class Solution210915_2 {

    boolean solution(String s) {
        String[] str = s.split("");
        int length = str.length;
        if (str[0].equals(")") || str[length - 1].equals("(")) {
            return false;
        }

        Stack<String> stack = new Stack<>();
        for (String a : str) {
            if (a.equals("(")) {
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
테스트 1 〉	통과 (0.12ms, 72.2MB)
테스트 2 〉	통과 (0.12ms, 68.2MB)
테스트 3 〉	통과 (0.11ms, 69.6MB)
테스트 4 〉	통과 (0.13ms, 59.2MB)
테스트 5 〉	통과 (0.21ms, 58.5MB)
테스트 6 〉	통과 (0.13ms, 59.1MB)
테스트 7 〉	통과 (0.23ms, 71.7MB)
테스트 8 〉	통과 (0.22ms, 71.6MB)
테스트 9 〉	통과 (0.30ms, 69MB)
테스트 10 〉	통과 (0.40ms, 61.9MB)
테스트 11 〉	통과 (0.23ms, 71.1MB)
테스트 12 〉	통과 (0.41ms, 61.4MB)
테스트 13 〉	통과 (0.47ms, 72.6MB)
테스트 14 〉	통과 (0.43ms, 68MB)
테스트 15 〉	통과 (0.41ms, 60.2MB)
테스트 16 〉	통과 (0.44ms, 68.8MB)
테스트 17 〉	통과 (0.41ms, 68.9MB)
테스트 18 〉	통과 (0.30ms, 68.6MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
*/
