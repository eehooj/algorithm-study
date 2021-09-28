package com.github.torissi.programmers.level1;

import java.util.HashSet;

public class Solution210928_1 {

    public int solution(int[] numbers) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int a : numbers) {
            hashSet.add(a);
        }

        for (int i = 0; i < 10; i++) {
            if (!hashSet.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
    }
}

/* 없는 숫자 더하기
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 수 ≤ 9
numbers의 모든 수는 서로 다릅니다.
입출력 예
numbers	result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	6
입출력 예 설명
입출력 예 #1

5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
입출력 예 #2

1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
*/

/*
테스트 1 〉	통과 (0.05ms, 84MB)
테스트 2 〉	통과 (0.09ms, 68.2MB)
테스트 3 〉	통과 (0.07ms, 65.9MB)
테스트 4 〉	통과 (0.06ms, 74.4MB)
테스트 5 〉	통과 (0.07ms, 73.3MB)
테스트 6 〉	통과 (0.04ms, 82.9MB)
테스트 7 〉	통과 (0.08ms, 73.1MB)
테스트 8 〉	통과 (0.07ms, 83.6MB)
테스트 9 〉	통과 (0.06ms, 79MB)
*/
