package com.github.torissi.focus.level1;

import java.util.ArrayList;
import java.util.List;

public class AddNotExistNumber {

    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int num : numbers) {
            list.add(num);
        }

        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AddNotExistNumber add = new AddNotExistNumber();
        int[] numbers = {1,2,3,4,6,7,8,0};

        add.solution(numbers);
    }
}

/*
     public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.64ms, 76.5MB)
테스트 2 〉	통과 (2.38ms, 72.5MB)
테스트 3 〉	통과 (228.07ms, 92.1MB)
테스트 4 〉	통과 (1.38ms, 71.6MB)
테스트 5 〉	통과 (1.13ms, 75.3MB)
테스트 6 〉	통과 (0.82ms, 70.5MB)
테스트 7 〉	통과 (0.84ms, 66.6MB)
테스트 8 〉	통과 (0.98ms, 73.1MB)
테스트 9 〉	통과 (0.95ms, 77.4MB)
* */

/* 없는 숫자 더하기
* 1. 숫자 배열
* 2. 0 - 9 까지 없는 숫자 더하기
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 77.5MB)
테스트 2 〉	통과 (0.03ms, 72.7MB)
테스트 3 〉	통과 (0.03ms, 74.8MB)
테스트 4 〉	통과 (0.04ms, 71.4MB)
테스트 5 〉	통과 (0.05ms, 76.8MB)
테스트 6 〉	통과 (0.06ms, 77.9MB)
테스트 7 〉	통과 (0.07ms, 77.8MB)
테스트 8 〉	통과 (0.05ms, 75.1MB)
테스트 9 〉	통과 (0.05ms, 75.5MB)
* */