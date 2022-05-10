package com.github.torissi.programmers.level1;

import java.util.*;

public class Solution220510_1 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int length = id_list.length;
        int[] answer = new int[length];
        Map<String, Set<String>> user = new HashMap<>();
        Map<String, Set<String>> bad = new HashMap();

        for (String item : id_list) {
            user.put(item, new HashSet<>());
            bad.put(item, new HashSet<>());
        }

        for (String item : report) {
            String[] temp = item.split(" ");
            bad.get(temp[1]).add(temp[0]);
            user.get(temp[0]).add(temp[1]);
        }

        for (String item : report) {
            String[] temp = item.split(" ");
            int size = bad.get(temp[1]).size();

            if (size < k) {
                user.get(temp[0]).remove(temp[1]);
            }
        }

        for (int i = 0; i < length; i++) {
            answer[i] = user.get(id_list[i]).size();
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        /*String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;*/

        solution(id_list, report, k);
    }
}

/* 신고 결과 받기
1. 한 번에 한 유저만 신고 가능
2. 유저는 신고 횟수 제한은 없으나, 동일한 유저에 대한 신고는 1회만 처리
3. k번 이상 신고된 유저는 정지처리
4. 정지되면 그 유저 신고한 유저들은 메일을 받음
5. 각 유저 별로 처리 결과 메일을 받은 횟수를 배열에 담아 return
*/

/*
테스트 1 〉	통과 (0.30ms, 74.1MB)
테스트 2 〉	통과 (0.29ms, 74.1MB)
테스트 3 〉	통과 (267.48ms, 230MB)
테스트 4 〉	통과 (0.48ms, 77.7MB)
테스트 5 〉	통과 (0.43ms, 75.1MB)
테스트 6 〉	통과 (5.08ms, 89.2MB)
테스트 7 〉	통과 (10.44ms, 89.4MB)
테스트 8 〉	통과 (16.45ms, 107MB)
테스트 9 〉	통과 (91.42ms, 156MB)
테스트 10 〉	통과 (110.15ms, 146MB)
테스트 11 〉	통과 (259.04ms, 204MB)
테스트 12 〉	통과 (1.38ms, 77.6MB)
테스트 13 〉	통과 (2.13ms, 77.6MB)
테스트 14 〉	통과 (99.31ms, 128MB)
테스트 15 〉	통과 (199.28ms, 180MB)
테스트 16 〉	통과 (1.57ms, 78.3MB)
테스트 17 〉	통과 (2.27ms, 82.3MB)
테스트 18 〉	통과 (2.38ms, 87.9MB)
테스트 19 〉	통과 (3.82ms, 79.4MB)
테스트 20 〉	통과 (139.32ms, 149MB)
테스트 21 〉	통과 (203.26ms, 183MB)
테스트 22 〉	통과 (0.10ms, 74.5MB)
테스트 23 〉	통과 (0.12ms, 77.1MB)
테스트 24 〉	통과 (0.13ms, 77.9MB)
*/
