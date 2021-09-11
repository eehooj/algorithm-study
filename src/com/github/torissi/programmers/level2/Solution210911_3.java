package com.github.torissi.programmers.level2;

public class Solution210911_3 {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int temp = 0;

            for (int j = i; j <= n; j++) {
                temp += j;
                if (temp == n) {
                    answer++;
                    break;
                } else if (temp > n) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(15);
    }
}

/* 숫자의 표현
문제 설명
Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

제한사항
n은 10,000 이하의 자연수 입니다.
입출력 예
n	result
15	4
입출력 예 설명
입출력 예#1
문제의 예시와 같습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 59.1MB)
테스트 2 〉	통과 (0.13ms, 71.4MB)
테스트 3 〉	통과 (0.07ms, 67.6MB)
테스트 4 〉	통과 (0.07ms, 72.7MB)
테스트 5 〉	통과 (0.04ms, 71.3MB)
테스트 6 〉	통과 (0.02ms, 58.9MB)
테스트 7 〉	통과 (0.06ms, 60.9MB)
테스트 8 〉	통과 (0.05ms, 74.1MB)
테스트 9 〉	통과 (0.04ms, 58.4MB)
테스트 10 〉	통과 (0.11ms, 70.2MB)
테스트 11 〉	통과 (0.09ms, 60.9MB)
테스트 12 〉	통과 (0.08ms, 72.4MB)
테스트 13 〉	통과 (0.07ms, 69.5MB)
테스트 14 〉	통과 (0.07ms, 69MB)
효율성  테스트
테스트 1 〉	통과 (1.77ms, 53.1MB)
테스트 2 〉	통과 (1.09ms, 53.8MB)
테스트 3 〉	통과 (1.36ms, 53MB)
테스트 4 〉	통과 (1.41ms, 51.5MB)
테스트 5 〉	통과 (1.53ms, 51.6MB)
테스트 6 〉	통과 (1.54ms, 52.9MB)
*/
