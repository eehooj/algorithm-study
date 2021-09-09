package com.github.torissi.programmers.level2;

public class Solution210908_1 {

    public static int solution(int[] arr) {
        int answer = arr[0];

        for (int j : arr) {
            answer = getLcm(answer, j);
        }

        return answer;
    }

    private static int getLcm(int answer, int i) {
        return answer * i / getGcd(answer, i); // 최소 공배수 구하기 = 두 수 곱하기 / 두 수의 최대 공약수
    }

    private static int getGcd(int answer, int i) {
        while (i != 0) { // 유클리드 호제법 (최대 공약수 문제는 대부분 유클리드 호제법)
            int temp = answer % i;
            answer = i;
            i = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        solution(arr);
    }
}

/* N개의 최소공배수
문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
예를 들어 2와 7의 최소공배수는 14가 됩니다.
정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.
입출력 예
arr	result
[2,6,8,14]	168
[1,2,3]	6
*/

/*
테스트 1 〉	통과 (0.03ms, 69.2MB)
테스트 2 〉	통과 (0.01ms, 59.8MB)
테스트 3 〉	통과 (0.02ms, 58.2MB)
테스트 4 〉	통과 (0.02ms, 72.9MB)
테스트 5 〉	통과 (0.02ms, 71.9MB)
테스트 6 〉	통과 (0.02ms, 60.1MB)
테스트 7 〉	통과 (0.02ms, 58.6MB)
테스트 8 〉	통과 (0.02ms, 62.4MB)
테스트 9 〉	통과 (0.02ms, 69.6MB)
테스트 10 〉	통과 (0.01ms, 60.9MB)
*/

/*
유클리드 호제법이란?
2개의 자연수를 받아 최대공약수를 받기 위해 2부터 두 자연수 중 작은 자연수까지 모두 나누어보면서 가장 큰 공약수를 구할 수 있다.

2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단 a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
이 성질에 따라, b를 r로 나눈 나머지 r0를 구하고, 다시 r을 r0로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때
나누는 수가 a와 b의 최대공약수이다.
*/