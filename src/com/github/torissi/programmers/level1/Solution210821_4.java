package com.github.torissi.programmers.level1;

public class Solution210821_4 {
    boolean solution(String s) {
        String s1 = s.toLowerCase();
        return s1.chars().filter(c -> c == 'p').count() == s1.chars().filter(c -> c == 'y').count();
    }
}

/*문자열 내 p와 y의 개수
문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
입출력 예
s	answer
"pPoooyY"	true
"Pyy"	false
입출력 예 설명
입출력 예 #1
'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.

입출력 예 #2
'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.
*/

/*
테스트 1 〉	통과 (1.60ms, 60.4MB)
테스트 2 〉	통과 (1.64ms, 73.9MB)
테스트 3 〉	통과 (2.05ms, 71.7MB)
테스트 4 〉	통과 (1.38ms, 69.8MB)
테스트 5 〉	통과 (1.72ms, 61.5MB)
테스트 6 〉	통과 (1.64ms, 58.6MB)
테스트 7 〉	통과 (0.96ms, 69.3MB)
테스트 8 〉	통과 (1.55ms, 59.3MB)
테스트 9 〉	통과 (1.46ms, 73.1MB)
테스트 10 〉	통과 (0.90ms, 60.5MB)
테스트 11 〉	통과 (0.95ms, 60MB)
테스트 12 〉	통과 (0.89ms, 70.9MB)
테스트 13 〉	통과 (0.99ms, 58.2MB)
테스트 14 〉	통과 (1.42ms, 60MB)
테스트 15 〉	통과 (1.39ms, 60.5MB)
테스트 16 〉	통과 (1.52ms, 69.3MB)
테스트 17 〉	통과 (0.91ms, 60.2MB)
테스트 18 〉	통과 (0.89ms, 71.4MB)
테스트 19 〉	통과 (0.94ms, 69.2MB)
테스트 20 〉	통과 (1.61ms, 60.6MB)
테스트 21 〉	통과 (0.87ms, 61.7MB)
테스트 22 〉	통과 (0.88ms, 58.7MB)
테스트 23 〉	통과 (0.99ms, 73.9MB)
테스트 24 〉	통과 (1.00ms, 70MB)
테스트 25 〉	통과 (0.93ms, 60.8MB)
테스트 26 〉	통과 (0.88ms, 59.6MB)
테스트 27 〉	통과 (0.92ms, 59.7MB)
테스트 28 〉	통과 (0.99ms, 72.9MB)
=> 람다가 깔끔하긴 하나 오래걸리군
* */