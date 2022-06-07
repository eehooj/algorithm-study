package com.github.torissi.stackorqueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {

    public static String solution(char[] cha){
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        for (char item : cha) {
            if (item == '(') {
                stack.push('C');
            }  else if (item == ')') {
                stack.pop();
            } else if (stack.isEmpty()) {
                builder.append(item);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        char[] cha = scanner.nextLine().toCharArray();

        System.out.println(solution(cha));
    }

}
