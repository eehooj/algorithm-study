package com.github.torissi.focus;

public class CreatingDecimalNumbers {

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

    private boolean isPrime(int sum) {
        if (sum <= 1) {
            return false;
        }

        int count = 0;

        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                count++;
            }
        }

        return count <= 2;
    }

    public static void main(String[] args) {
        CreatingDecimalNumbers add = new CreatingDecimalNumbers();
        int[] absolutes = {1,2,7,6,4};

        add.solution(absolutes);
    }
}

/*
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
* */

/*
정확성  테스트
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
* */

/* 소수 만들기
* 1. 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 수
* */

/*
정확성  테스트
테스트 1 〉	통과 (1.27ms, 72.2MB)
테스트 2 〉	통과 (2.52ms, 77MB)
테스트 3 〉	통과 (0.48ms, 76.4MB)
테스트 4 〉	통과 (0.42ms, 77.4MB)
테스트 5 〉	통과 (2.73ms, 78.3MB)
테스트 6 〉	통과 (11.09ms, 79.6MB)
테스트 7 〉	통과 (0.83ms, 75.7MB)
테스트 8 〉	통과 (16.76ms, 85.4MB)
테스트 9 〉	통과 (3.46ms, 72.4MB)
테스트 10 〉	통과 (17.31ms, 82.5MB)
테스트 11 〉	통과 (0.13ms, 71.7MB)
테스트 12 〉	통과 (0.07ms, 78.7MB)
테스트 13 〉	통과 (0.15ms, 66.7MB)
테스트 14 〉	통과 (0.06ms, 73.8MB)
테스트 15 〉	통과 (0.06ms, 75.5MB)
테스트 16 〉	통과 (63.29ms, 90.1MB)
테스트 17 〉	통과 (68.04ms, 95.4MB)
테스트 18 〉	통과 (1.85ms, 76.9MB)
테스트 19 〉	통과 (0.05ms, 72.3MB)
테스트 20 〉	통과 (79.85ms, 91.2MB)
테스트 21 〉	통과 (59.14ms, 77.1MB)
테스트 22 〉	통과 (14.64ms, 82.7MB)
테스트 23 〉	통과 (0.02ms, 74.6MB)
테스트 24 〉	통과 (54.42ms, 89MB)
테스트 25 〉	통과 (58.12ms, 90.4MB)
테스트 26 〉	통과 (0.02ms, 71.1MB)
* */