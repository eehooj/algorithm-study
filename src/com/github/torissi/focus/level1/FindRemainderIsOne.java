package com.github.torissi.focus.level1;

public class FindRemainderIsOne {

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindRemainderIsOne add = new FindRemainderIsOne();
        int signs = 12;

        add.solution(signs);
    }
}

/* 나머지가 1이 되는 수 찾기
* 1. 자연수 n 입력
* 2. n을 x로 나눈 나머지가 1이 되는 가장 작은 자연수 x 리턴
* */

/*
정확성  테스트
테스트 1 〉	통과 (4.30ms, 77.6MB)
테스트 2 〉	통과 (0.02ms, 72.2MB)
테스트 3 〉	통과 (0.01ms, 75.3MB)
테스트 4 〉	통과 (0.01ms, 75.4MB)
테스트 5 〉	통과 (0.02ms, 78.6MB)
테스트 6 〉	통과 (0.02ms, 72MB)
테스트 7 〉	통과 (0.04ms, 74.8MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.03ms, 76.5MB)
테스트 10 〉	통과 (0.02ms, 72.8MB)
테스트 11 〉	통과 (0.02ms, 75.5MB)
* */