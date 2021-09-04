package com.github.torissi.programmers.level1;

public class Solution210904_1 {

    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int prime) {
        int i1 = prime / 2;
        for (int i = 2; i < i1; i++) {
            if (prime % i == 0) {
               return false;
            }
        }
        return true;
    }

}

/* 소수 만들기
문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
입출력 예
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4
입출력 예 설명
입출력 예 #1
[1,2,4]를 이용해서 7을 만들 수 있습니다.

입출력 예 #2
[1,2,4]를 이용해서 7을 만들 수 있습니다.
[1,4,6]을 이용해서 11을 만들 수 있습니다.
[2,4,7]을 이용해서 13을 만들 수 있습니다.
[4,6,7]을 이용해서 17을 만들 수 있습니다.
*/

/*
테스트 1 〉	통과 (1.04ms, 73MB)
테스트 2 〉	통과 (1.04ms, 71MB)
테스트 3 〉	통과 (0.24ms, 70.7MB)
테스트 4 〉	통과 (0.20ms, 74MB)
테스트 5 〉	통과 (0.92ms, 68.2MB)
테스트 6 〉	통과 (2.76ms, 74.4MB)
테스트 7 〉	통과 (0.15ms, 70.2MB)
테스트 8 〉	통과 (3.19ms, 74.7MB)
테스트 9 〉	통과 (0.71ms, 71.9MB)
테스트 10 〉	통과 (3.69ms, 74MB)
테스트 11 〉	통과 (0.05ms, 70.7MB)
테스트 12 〉	통과 (0.04ms, 71.4MB)
테스트 13 〉	통과 (0.04ms, 59.7MB)
테스트 14 〉	통과 (0.05ms, 67.8MB)
테스트 15 〉	통과 (0.03ms, 70.1MB)
테스트 16 〉	통과 (7.18ms, 75MB)
테스트 17 〉	통과 (0.93ms, 70.3MB)
테스트 18 〉	통과 (0.38ms, 70.8MB)
테스트 19 〉	통과 (0.04ms, 60.3MB)
테스트 20 〉	통과 (6.70ms, 60.4MB)
테스트 21 〉	통과 (6.45ms, 59.4MB)
테스트 22 〉	통과 (0.32ms, 75.1MB)
테스트 23 〉	통과 (0.03ms, 75.1MB)
테스트 24 〉	통과 (8.99ms, 72MB)
테스트 25 〉	통과 (5.67ms, 71.1MB)
테스트 26 〉	통과 (0.02ms, 58.3MB)
*/