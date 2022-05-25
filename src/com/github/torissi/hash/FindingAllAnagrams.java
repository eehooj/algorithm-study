package com.github.torissi.hash;

import java.util.HashMap;
import java.util.Scanner;

public class FindingAllAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        char[] t = scanner.nextLine().toCharArray();

        int answer = 0;
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();

        for (char item : t) {
            tm.put(item, tm.getOrDefault(item, 0) + 1);
        }

        int tlength = t.length - 1;

        for (int i = 0; i < tlength; i++) {
            sm.put(s[i], sm.getOrDefault(s[i], 0) + 1);
        }

        int lt = 0;
        int slength = s.length;

        for (int i = tlength; i < slength; i++) {
            sm.put(s[i], sm.getOrDefault(s[i], 0) + 1);

            if (sm.equals(tm)) {
                answer++;
            }

            sm.put(s[lt], sm.get(s[lt]) - 1);

            if (sm.get(s[lt]) == 0) {
                sm.remove(s[lt]);
            }

            lt++;
        }

        System.out.println(answer);
    }
}

/*
* 1. S문자열 입력
* 2. T문자열 입력
* 3. S문자열에서 T문자열 아나그램이 되는 부분 문자열의 개수 구하기기
* */