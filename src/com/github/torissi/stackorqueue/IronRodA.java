package com.github.torissi.stackorqueue;

import java.util.Scanner;
import java.util.Stack;

public class IronRodA {

    public static int solution(char[] cha){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        int length = cha.length;

        for (int i = 0; i < length; i++) {
             if (cha[i] == '(') {
                 stack.push('(');
             } else {
                 if (cha[i - 1] == '(') {
                     stack.pop();
                     answer += stack.size();
                 } else {
                     stack.pop();
                     answer++;
                 }
             }
        }

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
* 1. 쇠막대기를 아래에서 위로 겹쳐 놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기를 자름
* 2. 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓을 수 있음
* 3. 각 쇠막대기를 자르는 레이저는 적어도 하나 존재
* 4. 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않음
* 5. 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍으로 표현
* 6.
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
146ms
2
정답입니다
27MB
141ms
3
정답입니다
27MB
147ms
4
정답입니다
27MB
152ms
5
정답입니다
27MB
122ms
* */