package com.github.torissi.focus.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int[] temp = commands[i];
            int start = temp[0] - 1;
            int end = temp[1];
            List<Integer> list = new ArrayList<>();

            for (int j = start; j < end; j++) {
                list.add(array[j]);
            }

            list.sort(null);
            answer[i] = list.get(temp[2] - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        NthNumber add = new NthNumber();
        int[] participant = {1, 5, 2, 6, 3, 7, 4};
        int[][] completion = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(add.solution(participant, completion)));
    }
}

/*
        int length = commands.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int[] temp = commands[i];
            int i1 = temp[1] - temp[0] + 1;
            int[] temp2 = new int[i1];

            for (int j = 0; j < i1; j++) {
                temp2[j] = array[j + temp[0] - 1];
            }

            Arrays.sort(temp2);

            answer[i] = temp2[temp[2] - 1];
        }

        return answer;
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.33ms, 59.9MB)
테스트 2 〉	통과 (0.33ms, 59.3MB)
테스트 3 〉	통과 (0.33ms, 69.4MB)
테스트 4 〉	통과 (0.36ms, 59.7MB)
테스트 5 〉	통과 (0.46ms, 70.8MB)
테스트 6 〉	통과 (0.50ms, 60.5MB)
테스트 7 〉	통과 (0.32ms, 69.7MB)
* */

/* N 번째 수
* 1. 배열의 i 번째 숫자 부터 j번째 숫자까지 자르고 정렬
* 2. k번째에 있는 수 구하기
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.19ms, 77.6MB)
테스트 2 〉	통과 (0.22ms, 75.3MB)
테스트 3 〉	통과 (0.19ms, 76.3MB)
테스트 4 〉	통과 (0.26ms, 75.1MB)
테스트 5 〉	통과 (0.19ms, 79.2MB)
테스트 6 〉	통과 (0.23ms, 73.7MB)
테스트 7 〉	통과 (0.29ms, 72.5MB)
* */