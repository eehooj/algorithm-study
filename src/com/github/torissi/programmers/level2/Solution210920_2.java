package com.github.torissi.programmers.level2;

public class Solution210920_2 {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 1; i <= sum; i++) {
            int col = sum / i; // 가로

            if (i > col) {
                continue;
            }

            if ((i - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}

/* 카펫
문제 설명
Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

carpet.png

Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
입출력 예
brown	yellow	return
10	2	[4, 3]
8	1	[3, 3]
24	24	[8, 6]
출처

※ 공지 - 2020년 2월 3일 테스트케이스가 추가되었습니다.
※ 공지 - 2020년 5월 11일 웹접근성을 고려하여 빨간색을 노란색으로 수정하였습니다.
*/

/*
테스트 1 〉	통과 (0.03ms, 71.4MB)
테스트 2 〉	통과 (0.01ms, 70.7MB)
테스트 3 〉	통과 (0.06ms, 61.2MB)
테스트 4 〉	통과 (0.03ms, 70.7MB)
테스트 5 〉	통과 (0.02ms, 68.4MB)
테스트 6 〉	통과 (0.04ms, 75MB)
테스트 7 〉	통과 (0.03ms, 75.3MB)
테스트 8 〉	통과 (0.07ms, 71.4MB)
테스트 9 〉	통과 (0.04ms, 67.8MB)
테스트 10 〉	통과 (0.09ms, 75.3MB)
테스트 11 〉	통과 (0.02ms, 74.1MB)
테스트 12 〉	통과 (0.01ms, 71.4MB)
테스트 13 〉	통과 (0.02ms, 61.5MB)
*/
