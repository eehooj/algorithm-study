package com.github.torissi.focus.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {

    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int length = answers.length;
        int[] math = new int[3];
        List<Integer> an = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int temp = answers[i];

            if (temp == a[i % 5]) {
                math[0]++;
            }

            if (temp == b[i % 8]) {
                math[1]++;
            }

            if (temp == c[i % 10]) {
                math[2]++;
            }
        }

        int max = Arrays.stream(math).max().getAsInt();

        for (int i = 0; i < 3; i++) {
            if (max == math[i]) {
                an.add(i + 1);
            }
        }

        int[] sol = new int[an.size()];

        for (int i = 0; i < an.size(); i++) {
            sol[i] = an.get(i);
        }

        return sol;
    }

    public static void main(String[] args) {
        MockTest add = new MockTest();
        int[] survey = {1,3,2,4,2};

        add.solution(survey);
    }
}


/* 모의고사
* 1.
* 2.
* */

/*
정확성  테스트
테스트 1 〉	통과 (1.29ms, 74MB)
테스트 2 〉	통과 (1.10ms, 73MB)
테스트 3 〉	통과 (0.67ms, 75.4MB)
테스트 4 〉	통과 (0.87ms, 79.8MB)
테스트 5 〉	통과 (0.80ms, 76.1MB)
테스트 6 〉	통과 (0.76ms, 68.4MB)
테스트 7 〉	통과 (0.90ms, 73.6MB)
테스트 8 〉	통과 (0.87ms, 77.3MB)
테스트 9 〉	통과 (1.31ms, 67.9MB)
테스트 10 〉	통과 (1.00ms, 79MB)
테스트 11 〉	통과 (1.25ms, 79.8MB)
테스트 12 〉	통과 (1.46ms, 76.4MB)
테스트 13 〉	통과 (0.75ms, 75MB)
테스트 14 〉	통과 (1.20ms, 77.7MB)
* */