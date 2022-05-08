package com.github.torissi.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] one = scanner.next().toCharArray();
        char[] two = scanner.next().toCharArray();
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for (char item : one) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (char item : two) {
            if (!map.containsKey(item) || map.get(item) == 0) {
                answer = "NO";

                break;
            }

            map.put(item, map.get(item) - 1);
        }

        System.out.println(answer);
    }
}

/*
* 1. 알파벳으로 이루어진 두 문장 입력
* 2. 알파벳 순서는 다르지만 구성이 같으면 YES, 다르면 NO 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
139ms
2
정답입니다
27MB
140ms
3
정답입니다
27MB
147ms
4
정답입니다
27MB
149ms
5
정답입니다
27MB
121ms
* */