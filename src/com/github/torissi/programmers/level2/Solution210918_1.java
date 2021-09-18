package com.github.torissi.programmers.level2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution210918_1 {

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> que = new ArrayDeque<>(50002);

        Arrays.sort(people);

        for (int a : people) {
            que.add(a);
        }

        while (!que.isEmpty()) {
            int temp = que.pollLast();

            if (!que.isEmpty()
                    && temp + que.peekFirst() <= limit) {
                que.pollFirst();
            }

            answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        int [] a = {70, 50, 80, 50};
        solution(a, 100);
    }
}

/* 구명보트
문제 설명
무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.

예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.

사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

제한사항
무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.
각 사람의 몸무게는 40kg 이상 240kg 이하입니다.
구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.
구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없습니다.
입출력 예
people	limit	return
[70, 50, 80, 50]	100	3
[70, 80, 50]	100	3
*/

/*
정확성  테스트
테스트 1 〉	통과 (2.99ms, 73.8MB)
테스트 2 〉	통과 (2.19ms, 58.4MB)
테스트 3 〉	통과 (2.51ms, 68.3MB)
테스트 4 〉	통과 (2.35ms, 59.9MB)
테스트 5 〉	통과 (1.89ms, 73.8MB)
테스트 6 〉	통과 (1.94ms, 74MB)
테스트 7 〉	통과 (2.04ms, 59.9MB)
테스트 8 〉	통과 (0.72ms, 71.1MB)
테스트 9 〉	통과 (0.87ms, 71.7MB)
테스트 10 〉	통과 (2.78ms, 74.9MB)
테스트 11 〉	통과 (2.45ms, 71.6MB)
테스트 12 〉	통과 (2.17ms, 72MB)
테스트 13 〉	통과 (2.36ms, 59.7MB)
테스트 14 〉	통과 (2.16ms, 73.9MB)
테스트 15 〉	통과 (0.96ms, 74.3MB)
효율성  테스트
테스트 1 〉	통과 (20.40ms, 57MB)
테스트 2 〉	통과 (19.74ms, 54MB)
테스트 3 〉	통과 (23.51ms, 54MB)
테스트 4 〉	통과 (17.78ms, 54MB)
테스트 5 〉	통과 (19.08ms, 55MB)
*/
