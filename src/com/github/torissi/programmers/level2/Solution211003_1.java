package com.github.torissi.programmers.level2;


public class Solution211003_1 {

    public int solution(int[] numbers, int target) {
        return bfs(numbers, target, numbers[0], 1) + bfs(numbers, target, -numbers[0], 1);
    }

    private int bfs(int[] numbers, int target, int number, int i) {
        if (i == numbers.length) {
            if (number == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;
        result += bfs(numbers, target, number + numbers[i], i + 1);
        result += bfs(numbers, target, number - numbers[i], i + 1);

        return result;
    }

    public static void main(String[] args) {
    }
}

/* 타겟 넘버
문제 설명
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.
입출력 예
numbers	target	return
[1, 1, 1, 1, 1]	3	5
입출력 예 설명
문제에 나온 예와 같습니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (4.24ms, 73.1MB)
테스트 2 〉	통과 (4.23ms, 76.1MB)
테스트 3 〉	통과 (0.20ms, 79.1MB)
테스트 4 〉	통과 (0.26ms, 77.4MB)
테스트 5 〉	통과 (0.57ms, 76.5MB)
테스트 6 〉	통과 (0.30ms, 85.6MB)
테스트 7 〉	통과 (0.19ms, 74.3MB)
테스트 8 〉	통과 (0.35ms, 77.9MB)
*/
