package com.github.torissi.programmers.level1;

public class Solution210824_1 {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];

        int length = answers.length;
        int alength = a.length;
        int blength = b.length;
        int clength = c.length;

        for (int i = 0; i < length; i++) {
            if (a[i % alength] == answers[i]) {
                correct[0]++;
            }
            if (b[i % blength] == answers[i]) {
                correct[1]++;
            }
            if (c[i % clength] == answers[i]) {
                correct[2]++;
            }
        }

        int max = Math.max(correct[0], Math.max(correct[1], correct[2]));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (max == correct[i]) {
                builder.append(i + 1);
            }
        }

        String[] str = builder.toString().split("");
        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}

/* 모의고사
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.
*/

/*
테스트 1 〉	통과 (0.19ms, 60.2MB)
테스트 2 〉	통과 (0.13ms, 71.8MB)
테스트 3 〉	통과 (0.13ms, 60.8MB)
테스트 4 〉	통과 (0.15ms, 60.4MB)
테스트 5 〉	통과 (0.14ms, 69.3MB)
테스트 6 〉	통과 (0.14ms, 71.4MB)
테스트 7 〉	통과 (0.59ms, 68.8MB)
테스트 8 〉	통과 (0.21ms, 75.1MB)
테스트 9 〉	통과 (0.61ms, 71MB)
테스트 10 〉	통과 (0.39ms, 60MB)
테스트 11 〉	통과 (1.01ms, 70.9MB)
테스트 12 〉	통과 (0.57ms, 59.3MB)
테스트 13 〉	통과 (0.18ms, 60.2MB)
테스트 14 〉	통과 (0.67ms, 68.8MB)
*/