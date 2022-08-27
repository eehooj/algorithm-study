package com.github.torissi.focus;

import java.util.*;

public class LottoMaxMin {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> rank = new HashMap<>();
        int correct = 0;
        int zero = 0;
        List<Integer> lottoList = new ArrayList<>();

        rank.put(0, 6);
        for (int i = 1; i < 7; i++) {
            rank.put(i, 7 - i);
        }

        for (int lotto : lottos) {
            lottoList.add(lotto);

            if (lotto == 0) {
                zero++;
            }
        }

        for (int win_num : win_nums) {
            int index = lottoList.indexOf(win_num);

            if (index != -1) {
                correct++;
            }
        }

        answer[0] = rank.get(correct + zero);
        answer[1] = rank.get(correct);

        return answer;
    }
}


/*    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int win_num : win_nums) {
            set.add(win_num);
        }

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            } else if (set.contains(lotto)) {
                count++;
            }
        }

        answer[0] = ranking(zero + count);
        answer[1] = ranking(count);

        return answer;
    }

    public int ranking(int num) {
        switch (num) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default: return 6;
        }
    }*/

/* 로또의 최고 순위와 최저 순위
* 1. 자신이 구매했던 로또로 당첨이 가능했던 최고순위와 최저순위를 알고 싶음
* 2. 알아볼 수 없는 번호는 0으로 표기
* 3. 당첨 가능한 최고 순위와 최저 순위 배열로 리턴
* 4. 중복 번호는 없음
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 73.5MB)
테스트 2 〉	통과 (0.06ms, 74.4MB)
테스트 3 〉	통과 (0.08ms, 78.8MB)
테스트 4 〉	통과 (0.05ms, 73.2MB)
테스트 5 〉	통과 (0.07ms, 72.6MB)
테스트 6 〉	통과 (0.07ms, 69MB)
테스트 7 〉	통과 (0.05ms, 82.6MB)
테스트 8 〉	통과 (0.04ms, 73.8MB)
테스트 9 〉	통과 (0.08ms, 77.8MB)
테스트 10 〉	통과 (0.07ms, 72.8MB)
테스트 11 〉	통과 (0.07ms, 84.3MB)
테스트 12 〉	통과 (0.06ms, 83.8MB)
테스트 13 〉	통과 (0.06ms, 75.7MB)
테스트 14 〉	통과 (0.06ms, 73.6MB)
테스트 15 〉	통과 (0.05ms, 74.9MB)
* */