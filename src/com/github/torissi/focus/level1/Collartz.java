package com.github.torissi.focus.level1;

public class Collartz {

    public int solution(int num) {
        long n = num;
        int answer = 0;

        if (n == 1) {
            return 0;
        }

        while (n != 1) {
            answer++;

            if (answer > 500) {
                return -1;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Collartz add = new Collartz();
        int[] signs = {2,2,3,3};
        int N = 626331;

        System.out.println(add.solution(N));
    }
}

/*
* 1. 주어진 수가 1이 될 때 까지 아래 작업을 반복하면 모든 수를 1로 만들 수 있음
* 2. 입력된 수가 짝수라면 2로 나눔 / 홀수하면 3을 곱하고 1을 더함
* 3. 결과로 나온 수에 같은 작업을 1이 될때까지 반복
* 4. 위 작업을 몇 번이나 반복해야 하는지 반환 (주어진 수가 1이면 0 반환, 500번 반복해도 1이 안된다면 -1 반환)
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 80.1MB)
테스트 2 〉	통과 (0.05ms, 77.4MB)
테스트 3 〉	통과 (0.05ms, 67MB)
테스트 4 〉	통과 (0.04ms, 76.7MB)
테스트 5 〉	통과 (0.05ms, 67MB)
테스트 6 〉	통과 (0.03ms, 78.4MB)
테스트 7 〉	통과 (0.04ms, 73.3MB)
테스트 8 〉	통과 (0.02ms, 72.1MB)
테스트 9 〉	통과 (0.02ms, 72.8MB)
테스트 10 〉	통과 (0.05ms, 90MB)
테스트 11 〉	통과 (0.06ms, 77.1MB)
테스트 12 〉	통과 (0.02ms, 72.2MB)
테스트 13 〉	통과 (0.01ms, 73.7MB)
테스트 14 〉	통과 (0.02ms, 74.7MB)
테스트 15 〉	통과 (0.04ms, 74.8MB)
테스트 16 〉	통과 (0.02ms, 76.9MB)
* */