package com.github.torissi.focus.level2.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberListA {

    public boolean solution(String[] phone_book) {
        List<String> phoneList = new ArrayList<>(Arrays.asList(phone_book));
        int length = phoneList.size() - 1;
        phoneList.sort(null);

        for (int i = 0; i < length; i++) {
            if (phoneList.get(i + 1).startsWith(phoneList.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        NumberListA num = new NumberListA();
        String[] s = {"119", "97674223", "1195524421"};

        System.out.println(num.solution(s));
    }
}

/* 전화번호 목록
* 1. 전화 번호 배열 입력
* 2. 어떤 번호가 다른 번호의 접두어인 경우 false, 아니면 true
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.25ms, 71.9MB)
테스트 2 〉	통과 (0.27ms, 77.1MB)
테스트 3 〉	통과 (0.20ms, 72.8MB)
테스트 4 〉	통과 (0.28ms, 90.7MB)
테스트 5 〉	통과 (0.23ms, 73.9MB)
테스트 6 〉	통과 (0.35ms, 73.7MB)
테스트 7 〉	통과 (0.32ms, 73.2MB)
테스트 8 〉	통과 (0.28ms, 76.6MB)
테스트 9 〉	통과 (0.30ms, 75.3MB)
테스트 10 〉	통과 (0.20ms, 73.1MB)
테스트 11 〉	통과 (0.25ms, 73.5MB)
테스트 12 〉	통과 (0.23ms, 73MB)
테스트 13 〉	통과 (0.21ms, 72.4MB)
테스트 14 〉	통과 (2.43ms, 79MB)
테스트 15 〉	통과 (2.44ms, 90.3MB)
테스트 16 〉	통과 (2.73ms, 74.9MB)
테스트 17 〉	통과 (3.46ms, 78.8MB)
테스트 18 〉	통과 (3.94ms, 83.1MB)
테스트 19 〉	통과 (4.65ms, 86.3MB)
테스트 20 〉	통과 (11.54ms, 86.2MB)
효율성  테스트
테스트 1 〉	통과 (21.13ms, 57.9MB)
테스트 2 〉	통과 (19.77ms, 55.8MB)
테스트 3 〉	통과 (238.02ms, 98.3MB)
테스트 4 〉	통과 (235.55ms, 97.9MB)
* */