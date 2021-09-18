package com.github.torissi.programmers.level2;

public class Solution210918_2 {

    public static int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length ; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }

                if (j == length - 1) {
                    answer[i] = j - i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3};
        solution(a);
    }
}

/* 주식가격
문제 설명
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.
입출력 예
prices	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
입출력 예 설명
1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
※ 공지 - 2019년 2월 28일 지문이 리뉴얼되었습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (0.01ms, 58.3MB)
테스트 2 〉	통과 (0.03ms, 72.8MB)
테스트 3 〉	통과 (0.13ms, 72.2MB)
테스트 4 〉	통과 (0.15ms, 71.6MB)
테스트 5 〉	통과 (0.30ms, 72.8MB)
테스트 6 〉	통과 (0.03ms, 71.6MB)
테스트 7 〉	통과 (0.15ms, 74.3MB)
테스트 8 〉	통과 (0.10ms, 70.7MB)
테스트 9 〉	통과 (0.02ms, 60.2MB)
테스트 10 〉	통과 (0.17ms, 60.3MB)
효율성  테스트
테스트 1 〉	통과 (19.62ms, 71.6MB)
테스트 2 〉	통과 (10.14ms, 64.7MB)
테스트 3 〉	통과 (19.21ms, 70.9MB)
테스트 4 〉	통과 (14.30ms, 68.4MB)
테스트 5 〉	통과 (12.92ms, 67.9MB)
*/
