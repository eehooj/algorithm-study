package com.github.torissi.focus.level1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {

    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer>  indicators = new HashMap<>();
        Map<Integer, Integer> defaultScore = new HashMap<>();
        int length = survey.length;

        indicators.put("R", 0); indicators.put("T", 0);
        indicators.put("C", 0); indicators.put("F", 0);
        indicators.put("J", 0); indicators.put("M", 0);
        indicators.put("A", 0); indicators.put("N", 0);

        for (int i = 1; i <= 7; i++) {
            defaultScore.put(i, 4 - i);
        }

        for (int i = 0; i < length; i++) {
            String serve = survey[i];
            int choice = choices[i];
            char[] tempSurvey = serve.toCharArray();
            Integer defaultValue = Math.abs(defaultScore.get(choice));

            if (choice < 4) {
                indicators.put(
                        String.valueOf(tempSurvey[0])
                        , indicators.getOrDefault(
                                String.valueOf(tempSurvey[0]) , 0) + defaultValue);
            } else {
                indicators.put(
                        String.valueOf(tempSurvey[1])
                        , indicators.getOrDefault(
                                String.valueOf(tempSurvey[1]) , 0) + defaultValue);
            }
        }

        if (indicators.get("R") >= indicators.get("T")) {
            answer.append("R");
        } else {
            answer.append("T");
        }

        if (indicators.get("C") >= indicators.get("F")) {
            answer.append("C");
        } else {
            answer.append("F");
        }

        if (indicators.get("J") >= indicators.get("M")) {
            answer.append("J");
        } else {
            answer.append("M");
        }

        if (indicators.get("A") >= indicators.get("N")) {
            answer.append("A");
        } else {
            answer.append("N");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        PersonalityTypeTest add = new PersonalityTypeTest();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        add.solution(survey, choices);
    }
}


/* 성격유형 검사하기
* 1. n개의 질문, 7개의 선택지
* 2.
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.08ms, 74MB)
테스트 2 〉	통과 (0.09ms, 67.3MB)
테스트 3 〉	통과 (0.08ms, 75.7MB)
테스트 4 〉	통과 (0.15ms, 76.1MB)
테스트 5 〉	통과 (0.08ms, 74.7MB)
테스트 6 〉	통과 (0.08ms, 73.5MB)
테스트 7 〉	통과 (0.22ms, 82.8MB)
테스트 8 〉	통과 (0.18ms, 73.4MB)
테스트 9 〉	통과 (0.20ms, 74.6MB)
테스트 10 〉	통과 (0.22ms, 79.7MB)
테스트 11 〉	통과 (0.29ms, 76.6MB)
테스트 12 〉	통과 (0.58ms, 77.8MB)
테스트 13 〉	통과 (0.72ms, 74.4MB)
테스트 14 〉	통과 (1.05ms, 74.7MB)
테스트 15 〉	통과 (0.98ms, 76.1MB)
테스트 16 〉	통과 (1.50ms, 74.2MB)
테스트 17 〉	통과 (1.61ms, 79.6MB)
테스트 18 〉	통과 (1.91ms, 81MB)
테스트 19 〉	통과 (1.36ms, 87MB)
테스트 20 〉	통과 (1.14ms, 78.1MB)
* */