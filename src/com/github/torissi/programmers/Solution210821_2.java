package com.github.torissi.programmers;

public class Solution210821_2 {
    public boolean solution(String s) {
        char[] ch = s.toCharArray();
        boolean answer = true;

        if (ch.length == 4 || ch.length == 6) {
            for (char a : ch) {
                if ((int) a > 57 || (int) a < 48) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }
}

/*문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s	return
"a234"	false
"1234"	true
*/

/*
테스트 1 〉	통과 (0.02ms, 69.7MB)
테스트 2 〉	통과 (0.02ms, 72.9MB)
테스트 3 〉	통과 (0.02ms, 73.2MB)
테스트 4 〉	통과 (0.04ms, 70.4MB)
테스트 5 〉	통과 (0.01ms, 67.8MB)
테스트 6 〉	통과 (0.03ms, 58.9MB)
테스트 7 〉	통과 (0.03ms, 70.7MB)
테스트 8 〉	통과 (0.02ms, 70.6MB)
테스트 9 〉	통과 (0.02ms, 60.1MB)
테스트 10 〉	통과 (0.02ms, 56.9MB)
테스트 11 〉	통과 (0.02ms, 60.6MB)
테스트 12 〉	통과 (0.02ms, 60.4MB)
테스트 13 〉	통과 (0.02ms, 69.4MB)
테스트 14 〉	통과 (0.02ms, 70.3MB)
테스트 15 〉	통과 (0.04ms, 71.4MB)
테스트 16 〉	통과 (0.02ms, 60.4MB)
* */