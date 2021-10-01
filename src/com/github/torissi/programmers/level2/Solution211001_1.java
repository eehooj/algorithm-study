package com.github.torissi.programmers.level2;

import java.util.PriorityQueue;

public class Solution211001_1 {

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int a : scoville) {
            queue.offer(a);
        }

        while (queue.peek() <= K) {
            if (queue.size() == 1) {
                return -1;
            }

            int first = queue.poll();
            int second = queue.poll();
            int temp = first + (second * 2);
            queue.offer(temp);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1,2,3};
        solution(scoville, 11);
    }
}

/*
print(solution([1, 1, 1], 4), 2)
print(solution([10, 10, 10, 10, 10], 100), 4)
print(solution([1, 2, 3, 9, 10, 12], 7), 2)
print(solution([0, 2, 3, 9, 10, 12], 7), 2)
print(solution([0, 0, 3, 9, 10, 12], 7), 3)
print(solution([0, 0, 0, 0], 7), -1)
print(solution([0, 0, 3, 9, 10, 12], 7000), -1)
print(solution([0, 0, 3, 9, 10, 12], 0), 0)
print(solution([0, 0, 3, 9, 10, 12], 1), 2)
print(solution([0, 0], 0), 0)
print(solution([0, 0], 1), -1)
print(solution([1, 0], 1), 1)
*/


/* 더 맵게
문제 설명
매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

제한 사항
scoville의 길이는 2 이상 1,000,000 이하입니다.
K는 0 이상 1,000,000,000 이하입니다.
scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
입출력 예
scoville	K	return
[1, 2, 3, 9, 10, 12]	7	2
입출력 예 설명
스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]

스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
가진 음식의 스코빌 지수 = [13, 9, 10, 12]

모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.

*/

/*
정확성  테스트
테스트 1 〉	통과 (0.32ms, 77.7MB)
테스트 2 〉	통과 (0.30ms, 77.8MB)
테스트 3 〉	통과 (0.34ms, 75.9MB)
테스트 4 〉	통과 (0.35ms, 77.1MB)
테스트 5 〉	통과 (0.31ms, 74.9MB)
테스트 6 〉	통과 (1.92ms, 76.3MB)
테스트 7 〉	통과 (1.50ms, 72.9MB)
테스트 8 〉	통과 (0.68ms, 75MB)
테스트 9 〉	통과 (0.65ms, 75.5MB)
테스트 10 〉	통과 (2.37ms, 78.1MB)
테스트 11 〉	통과 (1.28ms, 85.3MB)
테스트 12 〉	통과 (2.26ms, 76.6MB)
테스트 13 〉	통과 (2.24ms, 74MB)
테스트 14 〉	통과 (0.54ms, 79.1MB)
테스트 15 〉	통과 (1.79ms, 80.1MB)
테스트 16 〉	통과 (0.33ms, 77.3MB)
효율성  테스트
테스트 1 〉	통과 (132.44ms, 67.1MB)
테스트 2 〉	통과 (276.90ms, 94.3MB)
테스트 3 〉	통과 (1414.88ms, 122MB)
테스트 4 〉	통과 (143.22ms, 67MB)
테스트 5 〉	통과 (1498.53ms, 127MB)
*/
