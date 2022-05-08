package com.github.torissi.hash;

import java.util.*;

public class PeerLeader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] cha = scanner.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char item : cha) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        char answer = ' ';
        int max = 0;

        for (char item : map.keySet()) {
            if (map.get(item) > max) {
                answer = item;
                max = map.get(item);
            }
        }

        System.out.println(answer);
    }
}

/*
* 1. 반학생수와 투표용지 입력
* 2. 어떤 기호의 후보가 학급회장이 되었는지 출력
* */

/*
ID	결과	Memory	Time
1
정답입니다
27MB
169ms
2
정답입니다
27MB
155ms
3
정답입니다
27MB
170ms
4
정답입니다
27MB
179ms
5
정답입니다
27MB
180ms

* */