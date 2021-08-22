package com.github.torissi.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Solution210822_1 {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        Map<Integer, String> str = new HashMap<>();
        String[] answer = new String[length];

        Arrays.sort(strings);

        for (int i = 0; i < length; i++) {
            str.put(i, strings[i].substring(n, n + 1));
        }

        List<Map.Entry<Integer, String>> entries
                = str
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        int index = 0;
        for (Map.Entry<Integer, String> a : entries) {
            answer[index] = strings[a.getKey()];
            index++;
        }

        return answer;
    }
}

/* 문자열 내 마음대로 정렬하기
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
입출력 예 설명
입출력 예 1
"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.

입출력 예 2
"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. "abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.
*/

/*
테스트 1 〉	통과 (2.59ms, 59.6MB)
테스트 2 〉	통과 (2.36ms, 61MB)
테스트 3 〉	통과 (2.46ms, 72.8MB)
테스트 4 〉	통과 (2.35ms, 70.6MB)
테스트 5 〉	통과 (2.53ms, 58.8MB)
테스트 6 〉	통과 (2.57ms, 60.7MB)
테스트 7 〉	통과 (2.59ms, 60.8MB)
테스트 8 〉	통과 (2.78ms, 69.3MB)
테스트 9 〉	통과 (2.45ms, 61.8MB)
테스트 10 〉	통과 (3.08ms, 72MB)
테스트 11 〉	통과 (2.68ms, 61.5MB)
테스트 12 〉	통과 (2.90ms, 61.8MB)
*/