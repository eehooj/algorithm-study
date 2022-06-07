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
