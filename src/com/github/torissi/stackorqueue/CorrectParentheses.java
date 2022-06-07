package com.github.torissi.stackorqueue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {

    public static String solution(char[] cha){
        Stack<Character> stack = new Stack<>();
        String answer = "YES";

        if (cha[0] == ')') {
            return "NO";
        }

        for (char item : cha) {
            if (item == '(') {
                stack.push(item);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        char[] cha = scanner.nextLine().toCharArray();

        System.out.println(solution(cha));
    }
}

/*
ID	결과	Memory	Time
1
정답입니다
27MB
153ms
2
정답입니다
27MB
168ms
3
정답입니다
27MB
140ms
4
정답입니다
27MB
155ms
5
정답입니다
27MB
107ms
* */