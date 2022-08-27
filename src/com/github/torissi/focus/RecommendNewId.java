package com.github.torissi.focus;

import java.util.*;

public class RecommendNewId {

    public String solution(String new_id) {
        StringBuilder builder = new StringBuilder();
        String id = new_id.toLowerCase(Locale.ROOT); // 1
        id = id.replaceAll("[^a-z\\d\\-_.]*", ""); // 2
        id = id.replaceAll("\\.{2,}", "."); // 3
        id = id.replaceAll("^[.]|[.]$", ""); // 4
        id = id.isEmpty() ? "a" : id; // 5
        id = id.length() > 15 ? id.substring(0, 15) : id; // 6
        id = id.replaceAll("^[.]|[.]$", ""); // 4

        builder.append(id);

        if (id.length() < 3) {
            String last = id.substring(id.length() - 1);

            for (int i = 0; i < 3 - id.length(); i++) {
                builder.append(last);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        RecommendNewId id = new RecommendNewId();

        id.solution("abcdefghijklmn.p");
    }
}

/*
    public String solution(String new_id) {
        String upper = "^.*[A-Z]*$";
        if (Pattern.matches(upper, new_id)) { // 1단계
            new_id = new_id.toLowerCase();
        }

        String special = "[^a-z\\d\\-_.]*";
        new_id = new_id.replaceAll(special, "");

        String period = "\\.{2,}";
        new_id = new_id.replaceAll(period, ".");

        String first = "^[.]|[.]$";
        new_id = new_id.replaceAll(first, "");

        if (new_id.isEmpty()) { // 5단계
            new_id = "a";
        }

        if (new_id.length() > 15) { // 6단계
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll(first, "");
        }

        if (new_id.length() < 3) { // 7단계
            int a = 3 - new_id.length();
            for (int i = 0; i < a; i++) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }

        return new_id;
    }
**/

/*
정확성  테스트
테스트 1 〉	통과 (0.47ms, 73.6MB)
테스트 2 〉	통과 (11.56ms, 76.6MB)
테스트 3 〉	통과 (10.77ms, 70.9MB)
테스트 4 〉	통과 (0.77ms, 73.4MB)
테스트 5 〉	통과 (0.73ms, 57.5MB)
테스트 6 〉	통과 (0.71ms, 72.6MB)
테스트 7 〉	통과 (0.63ms, 59.5MB)
테스트 8 〉	통과 (0.83ms, 66.7MB)
테스트 9 〉	통과 (9.07ms, 76.5MB)
테스트 10 〉	통과 (0.57ms, 71.8MB)
테스트 11 〉	통과 (0.55ms, 77.9MB)
테스트 12 〉	통과 (1.22ms, 74MB)
테스트 13 〉	통과 (11.13ms, 71.9MB)
테스트 14 〉	통과 (0.78ms, 58.1MB)
테스트 15 〉	통과 (0.65ms, 58.6MB)
테스트 16 〉	통과 (1.51ms, 60.8MB)
테스트 17 〉	통과 (2.91ms, 68.7MB)
테스트 18 〉	통과 (4.82ms, 72.4MB)
테스트 19 〉	통과 (6.47ms, 69.8MB)
테스트 20 〉	통과 (2.31ms, 74.8MB)
테스트 21 〉	통과 (3.50ms, 71.5MB)
테스트 22 〉	통과 (14.38ms, 72.6MB)
테스트 23 〉	통과 (15.53ms, 71.2MB)
테스트 24 〉	통과 (9.15ms, 74.5MB)
테스트 25 〉	통과 (5.03ms, 66.3MB)
테스트 26 〉	통과 (4.38ms, 60.3MB)
* */

/* 신규 아이디 추천
* 1. 입력된 아이디와 유사하면서 규칙에 맞는 아이디 추천
* 2. 아이디 길이는 3 ~15
* 3. 알파벳, 소문자, -, _, . 만 사용 가능
* 4. .는 처음과 끝, 연속으로 사용 불가
* 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
* 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
* 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
* 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
* 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
* 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
*      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
* 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
* */

/*
정확성  테스트
테스트 1 〉	통과 (0.27ms, 77.2MB)
테스트 2 〉	통과 (0.25ms, 72.8MB)
테스트 3 〉	통과 (0.38ms, 71MB)
테스트 4 〉	통과 (0.44ms, 73.7MB)
테스트 5 〉	통과 (0.35ms, 72.6MB)
테스트 6 〉	통과 (0.32ms, 73.8MB)
테스트 7 〉	통과 (0.28ms, 76.6MB)
테스트 8 〉	통과 (0.33ms, 78.5MB)
테스트 9 〉	통과 (0.30ms, 80.1MB)
테스트 10 〉	통과 (0.25ms, 75MB)
테스트 11 〉	통과 (0.47ms, 74MB)
테스트 12 〉	통과 (0.50ms, 77.4MB)
테스트 13 〉	통과 (0.49ms, 74.3MB)
테스트 14 〉	통과 (0.53ms, 75.7MB)
테스트 15 〉	통과 (0.80ms, 76.4MB)
테스트 16 〉	통과 (0.84ms, 76.5MB)
테스트 17 〉	통과 (1.84ms, 74MB)
테스트 18 〉	통과 (3.85ms, 78.2MB)
테스트 19 〉	통과 (3.60ms, 72.6MB)
테스트 20 〉	통과 (1.48ms, 77.5MB)
테스트 21 〉	통과 (2.84ms, 75MB)
테스트 22 〉	통과 (1.64ms, 74.9MB)
테스트 23 〉	통과 (3.00ms, 76.4MB)
테스트 24 〉	통과 (3.72ms, 77MB)
테스트 25 〉	통과 (3.03ms, 74.6MB)
테스트 26 〉	통과 (3.20ms, 78.1MB)
* */