package com.github.torissi.focus.level1;

import java.util.Stack;

public class HateSameNumber {

    public int[] solution(int []arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for (int i = 1; i < length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int size = stack.size();
        int[] answer = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        HateSameNumber add = new HateSameNumber();
        int[] survey = {1,1,3,3,0,1,1};

        add.solution(survey);
    }
}


/* 같은 숫자는  싫어
* 1. 0부터 9까지로 이루어진 배열 arr
* 2. 연속적으로 나타나는 숫자는 하나만 남기고 제거
* */

/*
정확성  테스트
정확성  테스트
테스트 1 〉	통과 (0.12ms, 75.8MB)
테스트 2 〉	통과 (0.27ms, 76.3MB)
테스트 3 〉	통과 (0.24ms, 76.4MB)
테스트 4 〉	통과 (0.25ms, 75.7MB)
테스트 5 〉	통과 (0.22ms, 75.3MB)
테스트 6 〉	통과 (0.18ms, 73.3MB)
테스트 7 〉	통과 (0.19ms, 76.6MB)
테스트 8 〉	통과 (0.18ms, 73.8MB)
테스트 9 〉	통과 (0.22ms, 73.1MB)
테스트 10 〉	통과 (0.25ms, 72.7MB)
테스트 11 〉	통과 (0.17ms, 72.5MB)
테스트 12 〉	통과 (0.17ms, 73.7MB)
테스트 13 〉	통과 (0.20ms, 76.4MB)
테스트 14 〉	통과 (0.19ms, 72.5MB)
테스트 15 〉	통과 (0.22ms, 77.4MB)
테스트 16 〉	통과 (0.24ms, 75.5MB)
테스트 17 〉	통과 (0.11ms, 80.6MB)
효율성  테스트
테스트 1 〉	통과 (45.35ms, 112MB)
테스트 2 〉	통과 (47.57ms, 130MB)
테스트 3 〉	통과 (46.81ms, 113MB)
테스트 4 〉	통과 (49.87ms, 110MB)
* */