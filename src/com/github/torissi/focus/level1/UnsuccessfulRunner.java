package com.github.torissi.focus.level1;

import java.util.HashMap;
import java.util.Map;

public class UnsuccessfulRunner {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> attemptUser = new HashMap<>();

        for (String item : participant) {
            attemptUser.put(item, attemptUser.getOrDefault(item, 0) + 1);
        }

        for (String item : completion) {
            attemptUser.put(item, attemptUser.get(item) -1);
        }

        for (String item : participant) {
            if (attemptUser.get(item) == 1) {
                answer = item;

                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        UnsuccessfulRunner add = new UnsuccessfulRunner();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(add.solution(participant, completion));
    }
}

/*
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() != 0) {
                answer = e.getKey();
                break;
            }
        }


        return answer;
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.05ms, 73.3MB)
테스트 2 〉	통과 (0.07ms, 78.5MB)
테스트 3 〉	통과 (0.53ms, 77.4MB)
테스트 4 〉	통과 (0.80ms, 79.7MB)
테스트 5 〉	통과 (1.00ms, 82MB)
효율성  테스트
테스트 1 〉	통과 (42.51ms, 81.3MB)
테스트 2 〉	통과 (71.12ms, 89.2MB)
테스트 3 〉	통과 (79.30ms, 94.8MB)
테스트 4 〉	통과 (80.16ms, 95.6MB)
테스트 5 〉	통과 (76.56ms, 95.1MB)
* */

/*  완주하지 못한 선수
* 1. 단 한 명의 선수를 제외하고 모두 완주
* 2. 완지하지 못한 선수의 이름 리턴
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 78.9MB)
테스트 2 〉	통과 (0.06ms, 75.1MB)
테스트 3 〉	통과 (0.45ms, 76.7MB)
테스트 4 〉	통과 (0.65ms, 87.7MB)
테스트 5 〉	통과 (0.67ms, 74MB)
효율성  테스트
테스트 1 〉	통과 (41.97ms, 81.5MB)
테스트 2 〉	통과 (65.25ms, 88.4MB)
테스트 3 〉	통과 (66.20ms, 94.9MB)
테스트 4 〉	통과 (76.33ms, 95MB)
테스트 5 〉	통과 (82.98ms, 96MB)
* */