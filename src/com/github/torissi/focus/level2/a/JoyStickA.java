package com.github.torissi.focus.level2.a;

public class JoyStickA {

    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int index = 0;
        int move = length - 1;

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            index = i + 1;

            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }


        return answer + move;
    }

    public static void main(String[] args) {
        JoyStickA f = new JoyStickA();
        //String a = "JAN";
        //String a = "JEROEN";
        String a = "BBBBAAAAAAAB";

        System.out.println(f.solution(a));
    }
}

// 아스키 코드 대문자 -> 65 ~ 90

/* 조이스틱
* 1. 맨 처음 A로 시작하는 조이스틱
* 2. 만들고자 하는 이름을 입력
* 3. 몇 번 조작해야 하는지 리턴
*
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.19ms, 71.3MB)
테스트 2 〉	통과 (0.19ms, 72.6MB)
테스트 3 〉	통과 (0.25ms, 76.3MB)
테스트 4 〉	통과 (0.20ms, 77MB)
테스트 5 〉	통과 (0.14ms, 83MB)
테스트 6 〉	통과 (0.18ms, 70.4MB)
테스트 7 〉	통과 (0.23ms, 76.8MB)
테스트 8 〉	통과 (0.21ms, 77.8MB)
테스트 9 〉	통과 (0.18ms, 68.4MB)
테스트 10 〉	통과 (0.28ms, 70.1MB)
테스트 11 〉	통과 (0.13ms, 76.6MB)
* */