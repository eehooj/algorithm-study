package com.github.torissi.programmers.level1;

import java.util.ArrayList;

public class Solution210901_3 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (n >= 3) {
            list.add(n % 3);
            n /= 3;
        }

        list.add(n);

        for (int i = 0; i < list.size(); i++) {
            answer += Math.pow(3, list.size() - 1 - i) * list.get(i);
        }

        return answer;
    }

}

/* 3진법 뒤집기
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
입출력 예
n	result
45	7
125	229
입출력 예 설명
입출력 예 #1

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45	1200	0021	7
따라서 7을 return 해야 합니다.
입출력 예 #2

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125	11122	22111	229
따라서 229를 return 해야 합니다.
*/

/*
테스트 1 〉	통과 (0.05ms, 60.4MB)
테스트 2 〉	통과 (0.04ms, 60.4MB)
테스트 3 〉	통과 (0.04ms, 68.6MB)
테스트 4 〉	통과 (0.04ms, 70.5MB)
테스트 5 〉	통과 (0.05ms, 71.1MB)
테스트 6 〉	통과 (0.05ms, 60.6MB)
테스트 7 〉	통과 (0.05ms, 71.7MB)
테스트 8 〉	통과 (0.05ms, 69.2MB)
테스트 9 〉	통과 (0.05ms, 58.1MB)
테스트 10 〉	통과 (0.06ms, 61.8MB)
*/