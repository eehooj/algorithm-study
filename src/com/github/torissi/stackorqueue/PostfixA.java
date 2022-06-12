package com.github.torissi.stackorqueue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixA {

    public static int solution(char[] cha){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char item : cha) {
            if (Character.isDigit(item)) {
                stack.push(item - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (item =='+') {
                    stack.push(lt + rt);
                } else if (item =='-') {
                    stack.push(lt - rt);
                } else if (item =='*') {
                    stack.push(lt * rt);
                } else if (item =='/') {
                    stack.push(lt / rt);
                }
            }
        }

        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        char[] cha = scanner.nextLine().toCharArray();
        int solution = solution(cha);

        System.out.println(solution);
    }
}

/*
* 1. 후위연산식 입력
* 2. 결과 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
158ms
2
정답입니다
27MB
150ms
3
정답입니다
27MB
163ms
4
정답입니다
27MB
147ms
5
정답입니다
27MB
130ms
* */