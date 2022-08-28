package com.github.torissi.focus.level1;

import java.util.*;

public class PickTwoAndAdd {

    public int[] solution(int[] numbers) {
        Set<Integer> list = new HashSet<>();
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[list.size()];
        int index = 0;

        for (int item : list) {
            answer[index] = item;
            index++;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        PickTwoAndAdd add = new PickTwoAndAdd();
        int[] signs = {2,1,3,4,1};

        add.solution(signs);
    }
}

/*
    public int[] solution(int[] numbers) {
        Set<Integer> list = new TreeSet<>();
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > 0; j--) {
                if (i != j) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }


        int[] answer = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            answer[i] = iterator.next();
            i++;
        }
        return answer;
    }
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.57ms, 71.3MB)
테스트 2 〉	통과 (0.52ms, 70.4MB)
테스트 3 〉	통과 (0.51ms, 70.1MB)
테스트 4 〉	통과 (0.55ms, 57.9MB)
테스트 5 〉	통과 (0.76ms, 58.5MB)
테스트 6 〉	통과 (1.06ms, 71.9MB)
테스트 7 〉	통과 (2.97ms, 71.9MB)
테스트 8 〉	통과 (2.62ms, 60.9MB)
테스트 9 〉	통과 (2.12ms, 59.2MB)
* */

/* 두 개 뽑아서 더하기
* 1. 배열의 서로 다른 인덱스 수를 뽑음
* 2. 두 수를 더해서 만들 수 있는 모든 수를 배열에 담음
* 3. 오름차순으로 리턴
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.41ms, 72.6MB)
테스트 2 〉	통과 (0.35ms, 81.7MB)
테스트 3 〉	통과 (1.34ms, 76.2MB)
테스트 4 〉	통과 (1.39ms, 71.9MB)
테스트 5 〉	통과 (0.46ms, 72.1MB)
테스트 6 〉	통과 (0.79ms, 72.8MB)
테스트 7 〉	통과 (1.93ms, 82.4MB)
테스트 8 〉	통과 (0.86ms, 75.1MB)
테스트 9 〉	통과 (1.07ms, 75.6MB)
* */