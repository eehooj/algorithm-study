package com.github.torissi.focus.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lotto2 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int count = 0;
        int zero = 0;
        List<Integer> winList = new ArrayList<>();

        for (int item : win_nums) {
            winList.add(item);
        }

        for (int item : lottos) {
            if (item == 0) {
                zero++;

                continue;
            }

            if (winList.contains(item)) {
                count++;
            }
        }

        answer[0] = rank[count + zero];
        answer[1] = rank[count];

        return answer;
    }

    public static void main(String[] args) {
        Lotto2 add = new Lotto2();
        int[] signs = {2,2,3,3};
        int[] N = {};

        System.out.println(Arrays.toString(add.solution(signs, N)));
    }
}

/*
* 1.
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 73.1MB)
테스트 2 〉	통과 (0.03ms, 69.9MB)
테스트 3 〉	통과 (0.07ms, 92.9MB)
테스트 4 〉	통과 (0.05ms, 84.6MB)
테스트 5 〉	통과 (0.03ms, 75.1MB)
테스트 6 〉	통과 (0.04ms, 75.4MB)
테스트 7 〉	통과 (0.04ms, 73MB)
테스트 8 〉	통과 (0.03ms, 75.3MB)
테스트 9 〉	통과 (0.05ms, 80.4MB)
테스트 10 〉	통과 (0.04ms, 73.3MB)
테스트 11 〉	통과 (0.05ms, 77.2MB)
테스트 12 〉	통과 (0.05ms, 76.9MB)
테스트 13 〉	통과 (0.03ms, 73.2MB)
테스트 14 〉	통과 (0.04ms, 72.4MB)
테스트 15 〉	통과 (0.02ms, 73.6MB)
* */