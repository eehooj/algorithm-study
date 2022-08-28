package com.github.torissi.focus.level2;

import java.util.Stack;

public class CorrectParentheses {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cha = s.toCharArray();

        for (char item : cha) {
            if (item == '(') {
                stack.push(item);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}

/* 올바른 괄호
* 1. (로 열렸으면 반드시 )로 닫혀야 함
* 2. 올바른 분자열이면 true, 아니면 false
* */