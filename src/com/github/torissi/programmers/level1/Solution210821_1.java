package com.github.torissi.programmers.level1;

public class Solution210821_1 {
    public String solution(String[] seoul) {
        int num = 0;
        int length = seoul.length;

        for (int i = 0; i < length; i++) {
            if (seoul[i].equals("Kim")) {
                num = i;
                break;
            }
        }

        return "김서방은 " + num + "에 있다";
    }
}

/*서울에서 김서방 찾기
문제 설명
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
"Kim"은 반드시 seoul 안에 포함되어 있습니다.
입출력 예
seoul	return
["Jane", "Kim"]	"김서방은 1에 있다"
*/

/*
테스트 1 〉	통과 (5.76ms, 59.5MB)
테스트 2 〉	통과 (5.31ms, 59.2MB)
테스트 3 〉	통과 (5.87ms, 71.6MB)
테스트 4 〉	통과 (6.00ms, 59.9MB)
테스트 5 〉	통과 (6.56ms, 70.8MB)
테스트 6 〉	통과 (5.64ms, 71.1MB)
테스트 7 〉	통과 (6.10ms, 73.2MB)
테스트 8 〉	통과 (5.38ms, 73.2MB)
테스트 9 〉	통과 (6.31ms, 59.6MB)
테스트 10 〉	통과 (5.25ms, 58.8MB)
테스트 11 〉	통과 (5.41ms, 60.5MB)
테스트 12 〉	통과 (5.54ms, 59.3MB)
테스트 13 〉	통과 (5.66ms, 73.1MB)
테스트 14 〉	통과 (6.13ms, 71.9MB)
* */