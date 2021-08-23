package com.github.torissi.programmers;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution210823_2 {
    public String solution(int a, int b) {
        LocalDate of = LocalDate.of(2016, a, b);
        return of.getDayOfWeek()
                .getDisplayName(TextStyle.SHORT, Locale.US)
                .toUpperCase(Locale.ROOT);
    }
}

/* 2016년
문제 설명
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
입출력 예
a	b	result
5	24	"TUE"
*/

/*
테스트 1 〉	통과 (19.46ms, 60.1MB)
테스트 2 〉	통과 (127.62ms, 80.3MB)
테스트 3 〉	통과 (249.66ms, 61.1MB)
테스트 4 〉	통과 (16.23ms, 75.7MB)
테스트 5 〉	통과 (16.73ms, 72.4MB)
테스트 6 〉	통과 (23.30ms, 74MB)
테스트 7 〉	통과 (18.49ms, 75.8MB)
테스트 8 〉	통과 (16.62ms, 73.7MB)
테스트 9 〉	통과 (24.49ms, 72.7MB)
테스트 10 〉	통과 (23.45ms, 72.3MB)
테스트 11 〉	통과 (18.90ms, 77.3MB)
테스트 12 〉	통과 (16.48ms, 72.9MB)
테스트 13 〉	통과 (17.32ms, 61.2MB)
테스트 14 〉	통과 (17.69ms, 62.3MB)
*/