package com.github.torissi.programmers.level2;


import java.util.ArrayList;

public class Solution210923_2 {
    static int answer = 0;
    static boolean []check = new boolean[7];
    static ArrayList<Integer> arr = new ArrayList<>();

    public static int solution(String numbers) {
        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        for (Integer integer : arr) {
            if (isPrime(integer)) {
                answer++;
            }
        }

        return answer;
    }

    private static void dfs(String numbers, String s, int i) {
        if (s.length() == i) {
            int num = Integer.parseInt(s);

            if (!arr.contains(num)) {
                arr.add(num);
            }
        } else {
            for (int j = 0; j < numbers.length(); j++) {
                if (!check[j]) {
                    check[j] = true;
                    s += numbers.charAt(j);
                    dfs(numbers, s, i);
                    check[j] = false;
                    s = s.substring(0, s.length() - 1);
                }
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        solution("011");
    }
}

/* 소수 찾기
문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
입출력 예
numbers	return
"17"	3
"011"	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.
*/

/*
정확성  테스트
테스트 1 〉	통과 (9.67ms, 76.5MB)
테스트 2 〉	통과 (23.75ms, 83.7MB)
테스트 3 〉	통과 (11.04ms, 78MB)
테스트 4 〉	통과 (13.85ms, 79.7MB)
테스트 5 〉	통과 (26.18ms, 93.1MB)
테스트 6 〉	통과 (9.20ms, 78.4MB)
테스트 7 〉	통과 (10.47ms, 86.3MB)
테스트 8 〉	통과 (22.42ms, 91.8MB)
테스트 9 〉	통과 (10.98ms, 83.3MB)
테스트 10 〉	통과 (26.84ms, 79.2MB)
테스트 11 〉	통과 (18.70ms, 81.2MB)
테스트 12 〉	통과 (15.65ms, 83MB)
*/
