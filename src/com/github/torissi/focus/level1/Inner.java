package com.github.torissi.focus.level1;

public class Inner {

    public int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;

        for (int i = 0; i < length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Inner add = new Inner();
        int[] absolutes = {1,2,3,4};
        int[] signs = {-3,-1,0,2};

        add.solution(absolutes, signs);
    }
}

/* 내적
* 1. 길이가 같은 두 1차원 배열
* 2. 내적 리턴
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 77.6MB)
테스트 2 〉	통과 (0.02ms, 76.9MB)
테스트 3 〉	통과 (0.02ms, 78.9MB)
테스트 4 〉	통과 (0.01ms, 72.7MB)
테스트 5 〉	통과 (0.02ms, 82.2MB)
테스트 6 〉	통과 (0.02ms, 77.9MB)
테스트 7 〉	통과 (0.02ms, 78.8MB)
테스트 8 〉	통과 (0.03ms, 77.1MB)
테스트 9 〉	통과 (0.03ms, 86.5MB)
* */