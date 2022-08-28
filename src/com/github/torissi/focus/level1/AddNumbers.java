package com.github.torissi.focus.level1;

public class AddNumbers {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int length = absolutes.length;

        for (int i = 0; i < length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AddNumbers add = new AddNumbers();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        add.solution(absolutes, signs);
    }
}

/*
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] *= -1;
            }

            answer += absolutes[i];
        }

        return answer;
    }
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 59.4MB)
테스트 2 〉	통과 (0.04ms, 75.1MB)
테스트 3 〉	통과 (0.04ms, 75.8MB)
테스트 4 〉	통과 (0.05ms, 70.9MB)
테스트 5 〉	통과 (0.04ms, 61.1MB)
테스트 6 〉	통과 (0.05ms, 73.4MB)
테스트 7 〉	통과 (0.05ms, 71.2MB)
테스트 8 〉	통과 (0.04ms, 71.2MB)
테스트 9 〉	통과 (0.05ms, 69.7MB)
* */

/* 음양 더하기
* 1. 정수들의 절댓값이 담긴 정수 배열
* 2. 이 정수들의 부호를 담은 불리언 배열
* 3. 실제 정수들의 합 구하기
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 73MB)
테스트 2 〉	통과 (0.04ms, 78.6MB)
테스트 3 〉	통과 (0.06ms, 77.5MB)
테스트 4 〉	통과 (0.04ms, 74.3MB)
테스트 5 〉	통과 (0.03ms, 84.6MB)
테스트 6 〉	통과 (0.04ms, 79.2MB)
테스트 7 〉	통과 (0.04ms, 81.2MB)
테스트 8 〉	통과 (0.06ms, 73.3MB)
테스트 9 〉	통과 (0.04ms, 72.2MB)
* */